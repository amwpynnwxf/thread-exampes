package com.samples.base.equals;

import java.util.HashSet;

/**
 * equals、hashCode、散列表运用
 * @author HLH
 */
public class HashEquals {
    public static void main(String[] args) {
        /** 测试重写equals没有重写hashCode的情况，可以看到两个相等的对象重复出现在了HashSet中 */
        testPerson();

        /** 重写equals和hashCode的情况，可以看到两个相等的对象没有重复出现在HashSet中 */
        testPerson1();
    }

    private static void testPerson(){
        Person p1 = new Person("eee", 28);
        Person p2 = new Person("eee", 28);
        Person p3 = new Person("aaa", 30);

        HashSet set = new HashSet();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        // 比较p1 和 p2， 并打印它们的hashCode()，两个对象相等，但hashCode不同
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());

        // 打印set，由于没有重写hashCode，导致两个equals的对象在HashSet中重复出现
        System.out.printf("set:%s\n", set);
    }

    private static void testPerson1(){
        Person1 x1 = new Person1("eee", 28);
        Person1 x2 = new Person1("eee", 28);
        Person1 x3 = new Person1("aaa", 30);

        HashSet set = new HashSet();
        set.add(x1);
        set.add(x2);
        set.add(x3);

        // 比较p1 和 p2， 并打印它们的hashCode()，两个对象相等，hashCode也相同
        System.out.printf("x1.equals(p2) : %s; x1(%d) x2(%d)\n", x1.equals(x2), x1.hashCode(), x2.hashCode());

        // 打印set，重写了hashCode，所以两个相等的对象只会有一个在HashSet中
        System.out.printf("set:%s\n", set);
    }
}

/**
 * 重写equals,没有重写hashCode
 */
class Person{
    Integer age;
    String name;

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "("+name + ", " +age+")";
    }

    @Override
    public boolean equals(Object obj) {
        if(null == obj){
            return false;
        }

        if(this == obj){
            return  true;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }

        Person person = (Person)obj;
        return name.equals(person.name) && age==person.age;
    }
}


/**
 * 重写equals和hashCode
 */
class Person1{
    Integer age;
    String name;

    public Person1(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "("+name + ", " +age+")";
    }

    @Override
    public boolean equals(Object obj) {
        if(null == obj){
            return false;
        }

        if(this == obj){
            return  true;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }

        Person1 person = (Person1)obj;
        return name.equals(person.name) && age==person.age;
    }

    @Override
    public int hashCode() {
        int nameHash =  name.toUpperCase().hashCode();
        return nameHash ^ age;
    }
}
