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
class Student1{
    public void name(){
        System.out.println("Student:1");
    }
}

class Student2 extends Student1{
    public void name(){
        System.out.println("Student:2");
    }
    public void name(String name,int age){
        System.out.println("Name" +name+"Age: "+age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.name();
        Student2 s2=new Student2();
        s2.name();
        s2.name("User",20);
        
    }
}
