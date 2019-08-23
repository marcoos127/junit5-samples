package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.project.*;
import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
		assertEquals(-2, calculator.add(-1,-1));
		assertEquals(1.5, calculator.add(1.1, 0.4));
		assertEquals("a", calculator.add(1,2));
		assertEquals(0, calculator.add(-1,1));
    }
	@Test
	void sub() {
		assertEquals(2, calculator.sub(4,2));
		assertEquals(-4, calculator.sub(-2,2));
		assertEquals("a", calculator.sub(2,4));
		assertEquals(0, calculator.sub(-2,-2));
		assertEquals(2.5, calculator.sub(5,2.5));
	}
	@Test
	void div() {
		assertEquals("m", calculator.div(1,3));
		assertEquals(-2, calculator.div(-4,2));
		assertEquals(2.75, calculator.div(5.5,2));
		assertEquals(0, calculator.div(5,0));
		assertEquals(5, calculator.div(10,2));
	}
	@Test
	void mult() {
		assertEquals(4, calculator.mult(2,2));
		assertEquals(-6, calculator.mult(-3,2));
		assertEquals(0, calculator.mult(0,1));
		assertEquals(11.66, calculator.mult(2.2,5.3));
		assertEquals("n", calculator.mult(5,2));
	}
}