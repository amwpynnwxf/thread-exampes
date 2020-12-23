package com.samples.base.innerClz;

/**
 * 匿名内部类： 没有类名，其他各方面同局部内部类；如果局部内部类只需实例化一次，则可以用匿名内部类
 * @author HLH
 */
public class InnerTest5 {
    interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }

    public void sayHello(){

        // 局部内部类
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet(){
                greetSomeone("world");
            }
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        // 匿名内部类
        HelloWorld chineseGreeting = new HelloWorld() {
            String name = "世界";
            @Override
            public void greet() {
                greetSomeone("世界");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("你好  " + name);
            }
        };

        EnglishGreeting englishGreeting = new EnglishGreeting();
        englishGreeting.greet();
        chineseGreeting.greet();
    }

    public static void main(String[] args) {
        InnerTest5 test5 = new InnerTest5();
        test5.sayHello();
    }
}
