package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import javabrains.MathUtils;
import javabrains.StringUtils;

class ParameterizedTestExp {
	MathUtils mathUtils = new MathUtils();
	StringUtils stringUtils = new StringUtils();
	
	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6})
	void testIsEvenNumber(int candidate) {
		assertTrue(MathUtils.isEvenNumber(candidate), "The number should be even number");
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"racecar", "radar", "I am Thai Van"})
	void testPalindrome(String candidate) {
		assertTrue(StringUtils.isPalindrome(candidate), "The string should be palindrome");
	}

	
	@ParameterizedTest
	@NullSource
	void testPalindromeWithNull(String candidate) {
		assertTrue(StringUtils.isPalindrome(candidate), "The string should be palindrome");
	}
	
	@ParameterizedTest
	@EmptySource
	void testPalindromeWithEmpty(String candidate) {
//		System.out.println(candidate);
		assertTrue(StringUtils.isPalindrome(candidate), "The string should be palindrome");
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	void testPalindromeWithEmptyAndNull(String candidate) {
		System.out.println(candidate);
		assertTrue(StringUtils.isPalindrome(candidate), "The string should be palindrome");
	}


}
