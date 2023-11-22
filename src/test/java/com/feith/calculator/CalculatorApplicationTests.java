package com.feith.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private Calculator calculator = new Calculator();
	
	@Test
	@DisplayName("Simple Addition Test 1:")
	void testSum5(){
		assertEquals(5, calculator.sum(2,3));
	}

	@Test
	@DisplayName("Simple Addition Test 2:")
	void testSum10(){
		assertEquals(10, calculator.sum(2,8));
    }

}