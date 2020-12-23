package com.samples.base.innerClz;

/**
 * ��̬�ڲ��ࣺ �������ⲿ�ֻ࣬�ܷ����ⲿstatic��Դ
 * ����ʾ���������ڲ������״η��ʲű����ص�������ʵ��
 * @author HLH
 */
public class InnerTest4 {
    private InnerTest4(){

    }

    private static class Holder4{
        public static InnerTest4 instance = new InnerTest4();// �ڲ�����Է����ⲿprivate��Դ
    }

    public static InnerTest4 getInstance(){
        return Holder4.instance;// �����ڲ���
    }

    public void doSomething(){
        System.out.println("static InnerClass Singleton");
    }

    public static void main(String[] args) {
        InnerTest4 test4 = InnerTest4.getInstance();
        test4.doSomething();
    }
}
