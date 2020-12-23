package com.samples.base.innerClz;

/**
 * 私有内部类：内部类及对应外部类相互访问，包括private的成员和方法
 * 内部类默认是private的，其他外部类无法访问
 * @author HLH
 */
public class InnerTest1 {
    private Integer out = 10;
    class Inner2{
        private Integer in = 5;

        void add(){
            System.out.println(out+in);// 访问外部类
        }
    }

    public void func(){
        Inner2 inner2 = new Inner2();
        inner2.in = 8;// 访问内部类
        inner2.add();
    }

    public static void main(String[] args) {
        InnerTest1 test1 = new InnerTest1();
        test1.func();
    }
}
