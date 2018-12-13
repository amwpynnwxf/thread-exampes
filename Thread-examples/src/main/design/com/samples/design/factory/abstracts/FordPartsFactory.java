package com.samples.design.factory.abstracts;

/**
 * �����������
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
