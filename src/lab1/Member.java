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
public class Member extends Passenger{
    
    private int yearsOfMembership;
    
    public Member(String name, int age, int yearsOfMembership){
        super(name,age);
        this.yearsOfMembership=yearsOfMembership;
    }
    
    @Override
      public double ApplyDiscount(double p){
          if (yearsOfMembership>5){
              p=0.5*p;
              return p;
          }else if(yearsOfMembership>1 || yearsOfMembership<=5){
              p=0.9*p;
              return p;
          }else
              p=p;
          return p;
          
}
    
}
