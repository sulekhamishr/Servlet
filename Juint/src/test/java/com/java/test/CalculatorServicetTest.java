package com.java.test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;
public class CalculatorServicetTest {
	

	
	    int counter = 0;

	    // This method must be static and annotated with @BeforeClass
	    @BeforeClass
	    public static void init() {
	        System.out.println("Before all test cases");
	        System.out.println("Started test: " + new Date());
	    }

	    // This method must NOT be static
	    @Before
	    public void beforeEach() {
	        System.out.println("Before each test case");
	        counter = 0;
	    }

	    @Test
	    public void addTwoNumbersTest() {
	        System.out.println("Test for addTwoNumbers");
	        int result = CalculatorService.addTwoNumbers(12, 15);
	        int expected = 27;
	        assertEquals(expected, result);
	    }

	    @Test()
	    public void sumAnyNumberTest() {
	        for (int i = 1; i <= 20; i++) {
	            counter += i;
	        }
	        
	        System.out.println("Test for sumAnyNumbers");

	        double result = CalculatorService.sumAnyNumbers(2, 7, 8, 9);
	        int expectedResult = 26;
	        assertEquals(expectedResult, result, 0.001); // delta is needed for double comparison
	    }

	    @AfterClass
	    public static void cleanup() {
	        System.out.println("All test cases completed");
	        System.out.println("End test cases: " + new Date());
	    }
	}
