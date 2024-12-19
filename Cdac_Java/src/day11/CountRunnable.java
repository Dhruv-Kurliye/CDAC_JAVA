package day11;

public class CountRunnable {
		
	public static void main(String[] args) {
		Counter c = new Counter();
		new Thread(new Runnable() {
			public void  run() {
				synchronized(c) {
					for(int i=0; i<50; i++) {
						c.increment();
						System.out.println(Thread.currentThread().getName()+" "+c.getcount());
						try {
							Thread.sleep(500);
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
			
		}).start();
		
		new Thread(new Runnable() {
			public void  run() {
				synchronized(c) {
					for(int i=0; i<50; i++) {
						c.increment();
						System.out.println(Thread.currentThread().getName()+" "+c.getcount());
						try {
							Thread.sleep(500);
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
			
		}).start();
	}
}
