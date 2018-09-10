package com.thread.samples.ThreadNested;

/**
 * ���̡߳����߳�ͨѶ
 * ���߳�ѭ��2�Σ����߳�ѭ��5�Σ�����ѭ��ִ��
 * ͬ����notify��wait�Ķ��������ͬһ������Ȼ�ᱨ��IllegalMonitorStateException����
 * @author wuyouwulv
 *
 */
public class MainThreadTest {
	public static void main(String[] args) {
		SubThread subThread = new SubThread();
		subThread.start();

		int i = 0;

		synchronized (subThread.lock) {
			while (true) {
				if (i % 5 == 0) {
					subThread.lock.notifyAll();

					try {
						subThread.lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				i++;
				System.out.println("���߳�" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
