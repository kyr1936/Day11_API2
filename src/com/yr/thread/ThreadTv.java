package com.yr.thread;

public class ThreadTv extends Thread {
	@Override
	public void run() {
		tv();
		super.run();
	}

	private void tv() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("tv보기");
		}
	}
}
