package com.samples.base.innerClz;

/**
 * �ֲ��ڲ��ࣺ�ڷ������������ڵ��࣬�ͳ�Ա�ڲ����������ʽ����ڷ����ڻ��߸���������
 * �ֲ��ڲ�����񷽷�����ľֲ�����һ�����ǲ�����public��protected��private��static���η���
 * @author HLH
 */
public class InnerTest3 {
    private Integer num = 1;
    private Integer num1 = 10;

    public void func(){
        // �þֲ�����Ĭ�ϻᱻ����Ϊfinal����Ϊ�ñ������ŷ������ý�������ʧ�ˣ�
        // ���ڲ������øñ����������ڶ��ڴ�û����ʧ��
        // �����Ҫ��final���Σ�����ڴ�����num2��ֵ������num2�ı�������
        Integer num2 = 3;
        class Inner3{
            private Integer num = 2;

            void add(){
                // num2++; ������Ϊfinal���ܽ����޸�
                // ���Է����ⲿ���Լ�ͬ���������������Դ
                System.out.println(InnerTest3.this.num + num1 + this.num + num2);
            }
        }

        Inner3 inner3 = new Inner3();
        inner3.add();// ���ʾֲ��ڲ���
    }


    public void func2(){
        // �޷����ʾֲ��ڲ���
        //Inner3 inner3 = new Inner3();
    }

    public static void main(String[] args) {
        InnerTest3 test3 = new InnerTest3();
        test3.func();
    }

}
