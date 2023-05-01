package MultiThreading;

class SupportClass extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("This is Demon");
		}
		else
		System.out.println("Not Demon");
		
	}
}
public class DemonType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupportClass t1=new SupportClass();
		SupportClass t2=new SupportClass();
		
		t1.setDaemon(true);
		t1.setDaemon(false);
	}

}
