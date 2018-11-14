package com.thread.samples.ThreadNested;

/**
 * 主线程、子线程通讯
 * 子线程循环2次，主线程循环5次，依次循环执行
 * 同步、notify、wait的对象必须是同一个，不然会报：IllegalMonitorStateException错误
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
				System.out.println("主线程" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
