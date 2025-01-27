//package Assignment7thOct;
//
//public class MyArray extends Thread{
//	char [] greeting = {'G','O','O','D',' ','M','O','R','N','I','N','G'};
//	
//	public void run() {
//		for(int i=0;i<greeting.length;i++) {
//			System.out.print(Thread.currentThread().getName()+greeting[i]);
//		try {
//			Thread.sleep(2000);
//			
//		}
//		catch (InterruptedException e){
//			e.printStackTrace();
//		
//		}
//	}
//	}
//	
//	public static void main(String[] args) {
//		
//		
//		
//		Thread t1 = new Thread();
//		Thread t2 = new Thread();
//		t1.setName("first");
//		t2.setName("Second");
//		t1.start();
//		t2.start();
//		
//	}
//
//}

package Assignment7thOct;

public class MyArray extends Thread {
    static char[] greeting = {'G', 'O', 'O', 'D', ' ', 'M', 'O', 'R', 'N', 'I', 'N', 'G'};
    private static int index = 0; 
    private final int threadId; 

    public MyArray(int threadId) {
        this.threadId = threadId;
    }

    public void run() {
        while (index < greeting.length) {
        	synchronized (MyArray.class) { 
                if (index < greeting.length && index % 2 == threadId) {
                    System.out.print(greeting[index]);
                    index++;
                }
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyArray t1 = new MyArray(0); 
        MyArray t2 = new MyArray(1); 
        
        t1.setName("Thread 1: ");
        t2.setName("Thread 2: ");

        t1.start();
        t2.start();
    }
}

	
