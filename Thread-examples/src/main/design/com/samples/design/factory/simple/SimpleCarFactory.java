package com.samples.design.factory.simple;

public class SimpleCarFactory {
	public Car createCar(String carType){
		if("Benz".equalsIgnoreCase(carType)){
			return new Benz();
		}else if("Buick".equalsIgnoreCase(carType)){
			return new Buick();
		}else if("Audi".equalsIgnoreCase(carType)){
			return new Audi();
		}else{
			throw new IllegalArgumentException("找不到这个型号的车：" + carType);
		}
	}
}
