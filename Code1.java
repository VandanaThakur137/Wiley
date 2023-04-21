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
public class Code1 implements Cloneable {
    int a=7;
    public void add(){
        System.out.println("Adding Number");
    }
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException{
        //create obj using new keyword
        System.out.println("Calling using new");
        Code1 cd=new Code1();
        cd.add();
        //create object using newInstance
        Class c=Class.forName("JavaConcepts.Code1");
        Code1 ci= (Code1)c.newInstance();
        System.out.println("Calling using newInstance");
        ci.add();
        //create object using clone method
        Code1 objclone=(Code1) cd.clone();
        System.out.println("Calling using clone");
        objclone.add();
        
    }
    
}
