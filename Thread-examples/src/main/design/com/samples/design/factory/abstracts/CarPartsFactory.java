package com.samples.design.factory.abstracts;

/**
 * �����������
 * @author wuyouwulv
 *
 */
public interface CarPartsFactory {
	Engine createEngine();
	
	Clutch createClutch();
}
