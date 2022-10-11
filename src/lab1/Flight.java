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
public class Flight {
    
    //Instance variable declaration
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    //Constructor
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int x, double originalPrice ){
        
        //Initalization of instance variables
        this.flightNumber=flightNumber;
        this.origin=origin;
        this.destination=destination;
        this.departureTime=departureTime;
        this.originalPrice=originalPrice;
        this.capacity=x;
        this.numberOfSeatsLeft=x;
        
        if(origin.equals(destination)== true) {
           
            throw new IllegalArgumentException("Error: The origin and destination cannot be the same.");
            
        }
        
        
        
        
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    
    public boolean bookASeat(){
        if(numberOfSeatsLeft >0){
            numberOfSeatsLeft--;
            return(true);
        }
        else {
            return(false);
        }
    }
    
    @Override
    public String toString(){
        return ("Flight "+getFlightNumber()+", "+getOrigin()+" to "+getDestination()+", "+getDepartureTime()+" orignal price:"+getOriginalPrice()+"$");
    }
    
}
