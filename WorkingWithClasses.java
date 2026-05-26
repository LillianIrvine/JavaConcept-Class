/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.workingwithclasses;

/**
 *
 * @author lilly
 */
public class WorkingWithClasses {

    
    public static void main(String[] args) {
     WorkingWithClasses w = new WorkingWithClasses();
        ROCK rock = new ROCK();

        rock.setColor("Black");  
        System.out.println("the color of the rock is " + rock.getColor());
        System.out.println(rock);
        w.useROCK(rock);
    }
    public void useROCK(ROCK rock){
       System.out.println("wow"); 
    }
    public static void useROCKStatic(ROCK rock){
       System.out.println("wow"); 
    }
}
