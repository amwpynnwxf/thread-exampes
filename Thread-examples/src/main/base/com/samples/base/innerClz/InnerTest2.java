package com.samples.base.innerClz;

/**
 * 公有内部类： 内部类被外部访问
 * 内部类为了实现隐藏，默认是private，只供该外部类访问，此例仅为了尝试内部类public的情况, 正常应用几乎不存在
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
