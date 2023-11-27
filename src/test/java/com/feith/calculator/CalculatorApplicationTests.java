package com.feith.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private Calculator calculator = new Calculator();

	@ParameterizedTest
	@CsvSource({"2,8,10", "2,3,5", "5,6,11"})
	@DisplayName("Sum of two integers")
	void testSum10(int first, int second, int expected){
		assertEquals(expected, calculator.sum(first, second));
    }

}