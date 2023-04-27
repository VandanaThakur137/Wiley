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
class Person1{
    public void abc(){
        System.out.println("Hello abc");
    }
}

class Person2 extends Person1{
    public void def(){
        System.out.println("Hello def");
    }
}

class Person3 extends Person2{
    public void jkl(){
        System.out.println("Hello jkl");
    }
    
}
class Person4 extends Person1{
    public void vdt(){
        System.out.println("Hello vdt");
    }
}

public class HybridInherit {
    public static void main(String[] args) {
        Person3 p=new Person3();
        p.abc();
        p.def();
        p.jkl();
       Person4 pr=new Person4();
       pr.vdt();
    }
    
}
