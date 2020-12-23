package com.samples.base.equals;

import java.util.HashSet;

/**
 * equals��hashCode��ɢ�б�����
 * @author HLH
 */
public class HashEquals {
    public static void main(String[] args) {
        /** ������дequalsû����дhashCode����������Կ���������ȵĶ����ظ���������HashSet�� */
        testPerson();

        /** ��дequals��hashCode����������Կ���������ȵĶ���û���ظ�������HashSet�� */
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

        // �Ƚ�p1 �� p2�� ����ӡ���ǵ�hashCode()������������ȣ���hashCode��ͬ
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());

        // ��ӡset������û����дhashCode����������equals�Ķ�����HashSet���ظ�����
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

        // �Ƚ�p1 �� p2�� ����ӡ���ǵ�hashCode()������������ȣ�hashCodeҲ��ͬ
        System.out.printf("x1.equals(p2) : %s; x1(%d) x2(%d)\n", x1.equals(x2), x1.hashCode(), x2.hashCode());

        // ��ӡset����д��hashCode������������ȵĶ���ֻ����һ����HashSet��
        System.out.printf("set:%s\n", set);
    }
}

/**
 * ��дequals,û����дhashCode
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
 * ��дequals��hashCode
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
