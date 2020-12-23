package com.samples.base.innerClz;

/**
 * 局部内部类：在方法或作用域内的类，和成员内部类的区别访问仅限于方法内或者该作用域内
 * 局部内部类就像方法里面的局部变量一样，是不能有public、protected、private及static修饰符的
 * @author HLH
 */
public class InnerTest3 {
    private Integer num = 1;
    private Integer num1 = 10;

    public void func(){
        // 该局部变量默认会被修饰为final，因为该变量随着方法调用结束就消失了，
        // 而内部类引用该变量还存在于堆内存没有消失，
        // 因此需要用final修饰，则堆内存存的是num2的值而不是num2的变量引用
        Integer num2 = 3;
        class Inner3{
            private Integer num = 2;

            void add(){
                // num2++; 被修饰为final不能进行修改
                // 可以访问外部类以及同方法、作用域的资源
                System.out.println(InnerTest3.this.num + num1 + this.num + num2);
            }
        }

        Inner3 inner3 = new Inner3();
        inner3.add();// 访问局部内部类
    }


    public void func2(){
        // 无法访问局部内部类
        //Inner3 inner3 = new Inner3();
    }

    public static void main(String[] args) {
        InnerTest3 test3 = new InnerTest3();
        test3.func();
    }

}
