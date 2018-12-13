package com.samples.design.factory.abstracts;

/**
 * 大众配件工厂
 * @author wuyouwulv
 *
 */
public class VwPartsFactory implements CarPartsFactory {

	@Override
	public Engine createEngine() {
		return new VwEngine();
	}

	@Override
	public Clutch createClutch() {
		return new VwClutch();
	}

}
