package com.samples.base.innerClz;

/**
 * ˽���ڲ��ࣺ�ڲ��༰��Ӧ�ⲿ���໥���ʣ�����private�ĳ�Ա�ͷ���
 * �ڲ���Ĭ����private�ģ������ⲿ���޷�����
 * @author HLH
 */
public class InnerTest1 {
    private Integer out = 10;
    class Inner2{
        private Integer in = 5;

        void add(){
            System.out.println(out+in);// �����ⲿ��
        }
    }

    public void func(){
        Inner2 inner2 = new Inner2();
        inner2.in = 8;// �����ڲ���
        inner2.add();
    }

    public static void main(String[] args) {
        InnerTest1 test1 = new InnerTest1();
        test1.func();
    }
}
