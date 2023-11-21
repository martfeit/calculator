package com.feith.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private Calculator calculator = new Calculator();
	
	@Test
	//void contextLoads() {
	void testSum(){
		 assertEquals(5,calculator.sum(2,3));
		 System.out.println("im test");
	}
}


