package com.samples.base.equals;

/**
 * equals及==示例
 * @author HLH
 */
public class Equals1 {
    public static void main(String[] args) {
        /** 对象继承自Object，而Object对象的equals默认实现是==，因此该对象的equals不想等 */
        Sample c = new Sample("S");
        Sample x = new Sample("S");
        System.out.println(c.equals(x));

        /** Integer重写了equals，用它的值去判断, 并且也重写了hashCode以便集合中去比对 */
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println(a.equals(b));

        /** 重写对象equals，以实现值相等功能 */
        Sample1 u = new Sample1("S");
        Sample1 v = new Sample1("S");
        System.out.println(u.equals(v));
        // 不是同一个对象，所以不==，
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
     * 重写对象equals，以实现值相等
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
