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
class Test{
    public static int summ(int a,int b){
        int sum=a+b;
        //System.out.println("Sum at other class: "+sum);
        return sum;
    }
}
public class MethodTypes {
    public void sub(int v1,int v2){
        System.out.println("Instance substract: "+(v1-v2));
    }
    
    public void sum(int v1,int v2){
        System.out.println("Instance Sum: "+(v1+v2));
    }
    public int sum1(int v1,int v2){
        int v=v1+v2;
        mul(1,5);
        //System.out.println("Instance Sum: "+(v1+v2));
        return v;
    }
    
    public static void mul(int v1,int v2){
        System.out.println("Static Multiplication: "+(v1*v2));
    }
    
    public static void main(String[] args) {
        MethodTypes mt=new MethodTypes();
        mt.sub(10, 3);
        mt.sum(10,7);
        mul(10,6);
        int s1=mt.sum1(10,3);
        System.out.println("Sum using return: "+s1);
        System.out.println("Sum using other method: "+Test.summ(1,6));
    }
    
}
