package com.samples.design.factory.abstracts;

/**
 * �����������
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
