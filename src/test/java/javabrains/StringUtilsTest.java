package javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringUtilsTest {

	@ParameterizedTest
	@ValueSource(strings = {"racecar", "radar", "abcba"})
	void testPalindrome(String candidate) {
		StringUtils stringUtils = new StringUtils();
		assertTrue(stringUtils.isPalindrome(candidate), "Must be palindrome string");
	}

}
