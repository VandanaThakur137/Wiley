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
interface person{
public void getrole();
}

class Teacher implements person{
    public void getrole(){
        System.out.println("Teaching");
    }
}

interface student extends person{
    
}

class classroom extends Teacher implements student{
        public void getrole(){
        System.out.println("Classroom Teaching");
    }
}

public class DiamondProb {
    public static void main(String[] args) {
        classroom c=new classroom();
        c.getrole();
        Teacher t=new Teacher();
        t.getrole();
    }
    
}
