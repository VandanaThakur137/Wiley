package MultiThreading;
class Sheet{
	/*public synchronized void writeln(int k){
		for(int i=0;i<5;i++)
		System.out.println(i*k);
	}*/
	public void writeln(int k) {
		synchronized(this) {
			for(int i=0;i<5;i++) {
				System.out.println("in sync"+(i+k));
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println(i*k);
		}
		
	}
}

class Person1 extends Thread{
	Sheet st;
	public Person1(Sheet st) {
	public void run() {
		st.writeln(5);
	}
	}
}
class Person2 extends Thread{
	public Person1(Sheet st) {
	public void run() {
		st.writeln(i+k);
	}
	}
}

public class SynchronizationConcepts {

	public static void main(String[] args) {
		Sheet s=new Sheet();
		Person1 p1=new Person1(s);
		Person2 p2=new Person2();

	}

}
