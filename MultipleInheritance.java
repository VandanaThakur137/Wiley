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
class Vehicle{
    public void tier(){
        System.out.println("Tier");
    }
    public void airBag(){
        System.out.println("Air Bag");
    }
    
}
class SmartCar extends Vehicle{
    public void sensor(){
        System.out.println("Sensor");
    }
    
}

public class MultipleInheritance {
    public static void main(String[] args) {
        
    
    SmartCar scr=new SmartCar();
    scr.sensor();
    scr.airBag();
    scr.tier();
   
    }
    
}
