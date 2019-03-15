package com.samples.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "ddd1");

		// filter 过滤
		list.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
		// sort 排序
		list.stream().sorted().forEach(System.out::println);// 排序只针对stream，不会影响原数据
		// map 映射 
		list.stream().map(String::toUpperCase).sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);// 转大写并倒序
		// count 计数
		long bStartsCount = list.stream().filter(s -> s.startsWith("b")).count();
		System.out.println(bStartsCount);
		// reduce 合并
		Optional<String> strReduced = list.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);// 合并后的操作通过Optional接口表示
		System.out.println(strReduced.get());
		// 并行Streams
		list.parallelStream().filter(s -> s.startsWith("a")).count();// 多线程并行执行
		
		// match匹配：anyMatch、allMatch、noneMatch
	}

}
