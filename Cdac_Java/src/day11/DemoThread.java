package day11;

public class DemoThread {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		t1.start();
		
		
		Thread t3 = new Thread(new Thread2());
		t3.start();
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread - "+ i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}