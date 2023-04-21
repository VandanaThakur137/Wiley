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
public class VariableScope {
    int inst=20;
    int val=10;
    int val1=10;
    int val2=20;
    static String s="Vandana";
    public void sum(){
        int val1=2,val2=8;
        System.out.println("Sum is "+(val1+val2));
        System.out.println("Sum is "+(this.val1+this.val2));
    }
    public static void main(String[] args) {
        int loc=30;
        int val=19;
        //System.out.println("Sum is "+this.val);
        System.out.println("Local variable: "+loc);
        VariableScope vs=new VariableScope();
        System.out.println("Instance variable: "+vs.inst);
        System.out.println("variable of same name in instance block and ststic block: "+vs.val+" "+val);
        vs.sum();
    }
}
