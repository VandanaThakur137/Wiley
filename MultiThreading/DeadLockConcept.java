package MultiThreading;

public class DeadLockConcept extends Thread {

	public static void main(String[] args) {
		public static Object Lock1 =new Object();
		public static Object Lock2 =new Object();
	}
public	class LockingC{
		
		synchronized(Lock1) {
			System.out.println("Thresd on hold");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 1 is waiting");
		synchronized(Lock2) {
			System.out.println("Thresd1 waiting for lock2");
		}
	}

}
