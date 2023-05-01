package MultiThreading;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Mythread extends Thread{
	public void run() {
		System.out.println("Thread name: "+Thread.currentThread().getName());
	}
}

public class Threading1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService executor=Executors.newScheduledThreadPool(3);
		executor.scheduleWithFixedDelay(new Mythread(),3, 2, TimeUnit.SECONDS);


	}

}
