package com.samples.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1", "bbb3", "ccc", "ddd1");

		// filter ����
		list.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
		// sort ����
		list.stream().sorted().forEach(System.out::println);// ����ֻ���stream������Ӱ��ԭ����
		// map ӳ�� 
		list.stream().map(String::toUpperCase).sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);// ת��д������
		// count ����
		long bStartsCount = list.stream().filter(s -> s.startsWith("b")).count();
		System.out.println(bStartsCount);
		// reduce �ϲ�
		Optional<String> strReduced = list.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);// �ϲ���Ĳ���ͨ��Optional�ӿڱ�ʾ
		System.out.println(strReduced.get());
		// ����Streams
		list.parallelStream().filter(s -> s.startsWith("a")).count();// ���̲߳���ִ��
		
		// matchƥ�䣺anyMatch��allMatch��noneMatch
	}

}
