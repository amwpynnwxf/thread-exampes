package com.samples.design.facade;

/**
 * 外观模式(门面模式)，对一些内部功能进行封装后向外提供可访问接口(外部能访问到的只是外观)，隐藏系统的内部实现
 * @author wuyouwulv
 *
 */
public class FacadeTest {

	public static void main(String[] args) {
		ComputeFacade compute = new ComputeFacade();
		compute.start();
		System.out.println("<<.>>");
		compute.shutdown();
	}

}
