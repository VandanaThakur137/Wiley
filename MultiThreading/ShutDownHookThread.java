package MultiThreading;

class CloseEvent extends Thread{
	public void run() {
		System.out.println("Current Thread: "+Thread.currentThread().getName());
	}
}

public class ShutDownHookThread {

	public static void main(String[] args) {
		
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new CloseEvent());
		
		for(int i=0;i<10;i++) {
				CloseEvent t1 =new CloseEvent();
				t1.start();
		}

	}

}
