package com.samples.base.equals;

/**
 * equals��==ʾ��
 * @author HLH
 */
public class Equals1 {
    public static void main(String[] args) {
        /** ����̳���Object����Object�����equalsĬ��ʵ����==����˸ö����equals����� */
        Sample c = new Sample("S");
        Sample x = new Sample("S");
        System.out.println(c.equals(x));

        /** Integer��д��equals��������ֵȥ�ж�, ����Ҳ��д��hashCode�Ա㼯����ȥ�ȶ� */
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println(a.equals(b));

        /** ��д����equals����ʵ��ֵ��ȹ��� */
        Sample1 u = new Sample1("S");
        Sample1 v = new Sample1("S");
        System.out.println(u.equals(v));
        // ����ͬһ���������Բ�==��
        System.out.println(u == v);
    }
}

class Sample{
    String name;

    Sample(){
    }
    Sample(String name){
        this.name = name;
    }
}

class Sample1{
    String name;
    Sample1(){
    }

    Sample1(String name){
        this.name = name;
    }

    /**
     * ��д����equals����ʵ��ֵ���
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Sample1){
            Sample1 objThat = (Sample1)obj;
            return name.equals(objThat.name);
        }

        return false;
    }
}
