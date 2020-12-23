package com.samples.base.innerClz;

/**
 * 内部类多继承示例: 多功能打印机
 * 类似这种多继承，好像还不如组合？
 * @author HLH
 */
public class SmartPrinter {
    private String name = "多功能";
    // 多功能打印
    private class MultiPrinter extends Printer{
        public String print(){
            return name + super.print();
        }
    }
    // 多功能复印
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

// 打印机
class Printer{
    public String print(){
        return "打印";
    }
}

// 复印机
class Copy{
    public String copy(){
        return "复印";
    }
}
