package com.feith.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private Calculator calculator = new Calculator();
	
	@Test
	@DisplayName("Simple Addition Test 1:")
	void testSum5(){
		assertEquals(5, calculator.sum(2,3));
	}

	@ParameterizedTest
	@CsvSource("2,8,10")
	@DisplayName("Test 2 + 8 =10")
	void testSum10(int first, int second, int expected){
		assertEquals(expected, calculator.sum(first, second));
    }

}