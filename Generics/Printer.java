package Generics;

public class Printer<T> {
 T valueToprint;
 public Printer(T valueToprint){
	 super();
	 this.valueToprint=valueToprint;
 }
	
	public void print() {
		System.out.println(valueToprint);
	}

}
