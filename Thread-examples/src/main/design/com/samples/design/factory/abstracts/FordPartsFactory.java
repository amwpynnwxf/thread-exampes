package com.samples.design.factory.abstracts;

/**
 * 福特配件工厂
 * @author wuyouwulv
 *
 */
public class FordPartsFactory implements CarPartsFactory {

	@Override
	public Engine createEngine() {
		return new FordEngine();
	}

	@Override
	public Clutch createClutch() {
		return new FordCluth();
	}

}
