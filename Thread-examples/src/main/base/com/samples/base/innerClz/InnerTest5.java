package com.samples.base.innerClz;

/**
 * �����ڲ��ࣺ û������������������ͬ�ֲ��ڲ��ࣻ����ֲ��ڲ���ֻ��ʵ����һ�Σ�������������ڲ���
 * @author HLH
 */
public class InnerTest5 {
    interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }

    public void sayHello(){

        // �ֲ��ڲ���
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

        // �����ڲ���
        HelloWorld chineseGreeting = new HelloWorld() {
            String name = "����";
            @Override
            public void greet() {
                greetSomeone("����");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("���  " + name);
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
