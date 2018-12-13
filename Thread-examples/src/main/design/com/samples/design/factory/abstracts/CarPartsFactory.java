package com.samples.design.factory.abstracts;

/**
 * 汽车配件工厂
 * @author wuyouwulv
 *
 */
public interface CarPartsFactory {
	Engine createEngine();
	
	Clutch createClutch();
}
