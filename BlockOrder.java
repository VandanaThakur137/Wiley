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
public class BlockOrder {
    String name;
    int age;
    {
        name="Vandana";
        age=21;
    }
    public BlockOrder(){
        System.out.println("Constructor 0");
        System.out.println("Name and age is: "+name+" "+age);
    }
    public BlockOrder(int a){
        System.out.println("Constructor 1");
    }
    
    static{
        System.out.println("Static Block");//it executes only once
    }
    {
        System.out.println("Instance Block");
    }
    public static void main(String[] args) {
        BlockOrder br=new BlockOrder();
        new BlockOrder(7);
    }
    
}
