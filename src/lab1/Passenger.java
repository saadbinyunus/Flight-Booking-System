/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author USER
 */
public abstract class Passenger {
    
    //Instance Variables
    
    public String name;
    public int age;
    
    public Passenger(String name, int age){
        this.name=name;
        this.age=age;
        
     
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public abstract double ApplyDiscount(double p);
}