package com.samples.base.innerClz;

/**
 * �����ڲ���Ӧ�ã� RunnableӦ��
 * @author HLH
 */
public class InnerTest7 {
    public static void main(String[] args) {
        System.out.println("main >>> �߳����֣�" + Thread.currentThread().getName());

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread run >>> �߳����֣�" + Thread.currentThread().getName());
                for(int i=0; i<4; i++){
                    System.out.println("thread run >>>  i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("thread exited");
            }
        }).start();

        for(int i=0; i<4; i++){
            System.out.println("main >>>  i = " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("main exited");
    }
}
