package com.samples.design.factory.abstracts;

/**
 * ���󹤳�ģʽ����Բ�Ʒ��Ĵ���
 * ȱ�㣺������Ʒ��Ҫ�޸����в�Ʒ�Ĺ���
 * @author wuyouwulv
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		//����ĳ�ض�����ʱ���������������Ķ��Ǹó����µĲ�Ʒ������windows��ֻ�ᴴ��windowsģʽ��button��text��
		//������Ĳ�Ʒ������ôʹ�þ���ôʹ�ã���Ҫ������������Ի�ס(�����������һ��Ҫ��װ��һ��)
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
