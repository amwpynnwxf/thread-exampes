package com.samples.base.innerClz;

/**
 * �ڲ����̳�ʾ��: �๦�ܴ�ӡ��
 * �������ֶ�̳У����񻹲�����ϣ�
 * @author HLH
 */
public class SmartPrinter {
    private String name = "�๦��";
    // �๦�ܴ�ӡ
    private class MultiPrinter extends Printer{
        public String print(){
            return name + super.print();
        }
    }
    // �๦�ܸ�ӡ
    private class MultiCopier extends Copy{
        public String copy(){
            return name + super.copy();
        }
    }

    public String print(){
        return new MultiPrinter().print();
    }

    public String copy(){
        return new MultiCopier().copy();
    }

    public static void main(String[] args) {
        SmartPrinter smartPrinter = new SmartPrinter();
        System.out.println(smartPrinter.print() + " & " + smartPrinter.copy());
    }

}

// ��ӡ��
class Printer{
    public String print(){
        return "��ӡ";
    }
}

// ��ӡ��
class Copy{
    public String copy(){
        return "��ӡ";
    }
}
