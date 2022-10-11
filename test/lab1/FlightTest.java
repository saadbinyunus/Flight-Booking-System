/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Flight test = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        int expResult = 40;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 0;
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        instance.setFlightNumber(flightNumber);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        String expResult = "Dubai";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "test";
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        instance.setOrigin(origin);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        String expResult = "Paris";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "test";
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        String expResult = "30/01/22 11pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "test";
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        instance.setDepartureTime(departureTime);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance =new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        int expResult = 10;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance =new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        int expResult = 10;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 0;
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        double expResult = 10.0;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 0.0;
        Flight instance =new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        instance.setOriginalPrice(originalPrice);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(40,"Dubai","Paris","30/01/22 11pm",10,10.0);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Flight.
     */
    
}
    

