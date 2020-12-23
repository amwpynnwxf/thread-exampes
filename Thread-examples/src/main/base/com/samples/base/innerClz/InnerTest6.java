package com.samples.base.innerClz;

import com.thread.samples.test.Test;

/**
 * �����ڲ�������֮����������Ϊ����
 * @author HLH
 */
public class InnerTest6 {
    public void test(Bird bird){
        System.out.println(bird.getName() + "�ܹ��� " + bird.fly(1000) + "��");
    }

    public static void main(String[] args) {
        InnerTest6 test6 = new InnerTest6();
        test6.test(new Bird() {
            public int fly(Integer x) {
                return x;
            }

            public String getName() {
                return "����";
            }
        });
    }

}

abstract class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly(Integer x);
}
