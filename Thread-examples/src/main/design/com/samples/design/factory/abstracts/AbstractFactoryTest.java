package com.samples.design.factory.abstracts;

/**
 * 抽象工厂模式：针对产品族的创建
 * 缺点：新增产品需要修改所有产品的工厂
 * @author wuyouwulv
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		//处于某特定场景时，工厂类所创建的都是该场景下的产品，比如windows下只会创建windows模式的button、text等
		//创建后的产品，该怎么使用就怎么使用，不要被这里的例子迷惑住(此例：配件不一定要组装在一起)
		CarPartsFactory fordCarPartsFactory = new FordPartsFactory();
		Engine fordEngine = fordCarPartsFactory.createEngine();
		Clutch fordClutch = fordCarPartsFactory.createClutch();
		fordEngine.start();
		fordEngine.run();
		fordClutch.work();

		CarPartsFactory vwCarPartsFactory = new VwPartsFactory();
		Engine vwEngine = vwCarPartsFactory.createEngine();
		Clutch vwClutch = vwCarPartsFactory.createClutch();
		vwEngine.start();
		vwEngine.run();
		vwClutch.work();
	}

}
