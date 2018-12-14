package com.samples.design.decorator;

/**
 * װ�����ĳ���
 * @author wuyouwulv
 *
 */
public class AbstractComponentDecorator implements Component {
	// ���б�װ�������ʵ��
	private Component component;
	// ����Ĺ��캯��
	public AbstractComponentDecorator(Component component) {
		this.component = component;
	}
	@Override
	public void operation(String arg) {
		component.operation(arg);//���ñ�װ������ķ���
	}
	
	public AbstractComponentDecorator() {
		super();
	}

}
