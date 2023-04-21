/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaConcepts;

/**
 *
 * @author Sir2
 */
public class TypeOfConstructors {
    
    TypeOfConstructors(){
        System.out.println("Construct 0");
}
    
    TypeOfConstructors(int a){
        this(2,7);//Calling another construct inside one constructor
        System.out.println("Construct 1: "+a);
        //this.(2,7) it wouldnt work bcz other const call must be the first thing
}
    
    TypeOfConstructors(float a, int b){
        System.out.println("Construct 2: "+(a+b));
}
    
    public void add(){
        System.out.println("sum : ");
    }
    public static void main(String[] args) {
        TypeOfConstructors tc= new TypeOfConstructors();
        TypeOfConstructors tc1= new TypeOfConstructors(7);
        TypeOfConstructors tc2= new TypeOfConstructors(30.5f,7);
        //tc.add();
    }
    
}
