package com.samples.base.innerClz;

/**
 * 静态内部类： 不依赖外部类，只能访问外部static资源
 * 单例示例，利用内部类在首次访问才被加载的特性来实现
 * @author HLH
 */
public class InnerTest4 {
    private InnerTest4(){

    }

    private static class Holder4{
        public static InnerTest4 instance = new InnerTest4();// 内部类可以访问外部private资源
    }

    public static InnerTest4 getInstance(){
        return Holder4.instance;// 访问内部类
    }

    public void doSomething(){
        System.out.println("static InnerClass Singleton");
    }

    public static void main(String[] args) {
        InnerTest4 test4 = InnerTest4.getInstance();
        test4.doSomething();
    }
}
