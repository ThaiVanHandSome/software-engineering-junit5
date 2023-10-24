package javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestExp {
	MathUtils mathUtils = new MathUtils();
	StringUtils stringUtils = new StringUtils();
	
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
	void testIsEvenNumber(int candidate) {
		assertTrue(mathUtils.isEvenNumber(candidate), "The number should be even number");
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"racecar", "radar", "I am Thai Van"})
	void testPalindrome(String candidate) {
		assertTrue(stringUtils.isPalindrome(candidate), "The string should be palindrome");
	}
	
	@ParameterizedTest
	@NullSource
	void testPalindromeWithNull(String candidate) {
		assertTrue(stringUtils.isPalindrome(candidate), "The string should be palindrome");
	}
	
	@ParameterizedTest
	@EmptySource
	void testPalindromeWithEmpty(String candidate) {
		assertTrue(stringUtils.isPalindrome(candidate), "The string should be palindrome");
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	void testPalindromeWithEmptyAndNull(String candidate) {
		System.out.println(candidate);
		assertTrue(stringUtils.isPalindrome(candidate), "The string should be palindrome");
	}


}
