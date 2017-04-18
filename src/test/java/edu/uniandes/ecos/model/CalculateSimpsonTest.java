package edu.uniandes.ecos.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateSimpsonTest {
	private static final double DELTA = 1e-15;
	
        @Test
	public void testCalculateX() {
		CalculateSimpson instance = new CalculateSimpson();
		double expResult = 0.553375244140625; 
		double result = instance.calculateX(6, 0.20);
		assertEquals(expResult, result,DELTA);
	}
        
	@Test
	public void testCalculate() {
		CalculateSimpson instance = new CalculateSimpson();
		double expResult = 0.4949998582485177; 
		double result = instance.calculate(2.750, 30.0);
		assertEquals(expResult, result,DELTA);
	}

	@Test
	public void testCalculateSegments() {
		CalculateSimpson instance = new CalculateSimpson();
		double expResult = 0.4949969400285226; 
		double result = instance.calculateSegments(2.750, 30.0, 10);
		assertEquals(expResult, result,DELTA);
	}

	@Test
	public void testCalculateDistributionT() {
		CalculateSimpson instance = new CalculateSimpson();
		double expResult = 0.3956321848940978; 
		double result = instance.calculateDistributionT(2.750, 30.0);
		assertEquals(expResult, result,DELTA);
	}
}
