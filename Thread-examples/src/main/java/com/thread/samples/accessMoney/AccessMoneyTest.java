package com.thread.samples.accessMoney;

/**
 * ����ȡǮ(ÿ��ȡ100��Ǯ����֪ͨ�����Ǯ)�������Ǯ(ÿ�δ�2000����������֪ͨ����ȡǮ)
 * ���̵߳ȴ����������ж�Ҫʹ��while������if�������жϡ��������̱߳����Ѻ󣬻��ٴ��ж������Ƿ���������
 * @author wuyouwulv
 *
 */
public class AccessMoneyTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Mother mother = new Mother(bank);
		Children c1 = new Children(bank);
		Children c2 = new Children(bank);
		Children c3 = new Children(bank);
		c1.setName("c1");
		c2.setName("c2");
		c3.setName("c3");
		
		mother.start();
		c1.start();
		c2.start();
		c3.start();
	}

}
