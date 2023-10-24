package javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExp {
	MathUtils mathUtils = new MathUtils();
	StringUtils stringUtils = new StringUtils();

	@Test
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add 2 numbers");
	}
	
	@Test
	void testIsPalindrome() {
		String inp = "radar";
		assertTrue(stringUtils.isPalindrome(inp), "The string should be palindrome");
	}	

}
