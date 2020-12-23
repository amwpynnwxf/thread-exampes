package com.samples.base.innerClz;

/**
 * �����ڲ��ࣺ �ڲ��౻�ⲿ����
 * �ڲ���Ϊ��ʵ�����أ�Ĭ����private��ֻ�����ⲿ����ʣ�������Ϊ�˳����ڲ���public�����, ����Ӧ�ü���������
 * @author HLH
 */
public class InnerTest2 {
    private Integer a;
    public class Inner2{
        Integer i;

        void add(Integer x){
            i = a + x;
        }
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public static void main(String[] args) {
        InnerTest2 innerTest2 = new InnerTest2();
        innerTest2.setA(5);

        InnerTest2.Inner2 inner2 = innerTest2.new Inner2();
        inner2.add(3);
        System.out.println(inner2.i);
    }
}
