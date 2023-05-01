package MultiThreading;

class Demo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread name: "+Thread.currentThread().getName());
		
	}
	
}

public class ThreadGroupsConcept {

	public static void main(String[] args) {
		ThreadGroup tgparent=new ThreadGroup("Parent Group");
		ThreadGroup tgchild=new ThreadGroup(tgparent,"child group");
		
		Thread t1=new Thread(tgparent,new Demo(),"First thread");
		Thread t2=new Thread(tgparent,new Demo(),"Second thread");
		Thread t3=new Thread(tgparent,new Demo(),"Third thread");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Active Parent Gruop Threads:"+tgparent.activeCount());
		System.out.println("Active Child Group Threads:"+tgchild.activeCount());
		tgparent.list();

	}

}
