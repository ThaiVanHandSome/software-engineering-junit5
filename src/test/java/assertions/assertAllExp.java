package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertAllExp {
	MathUtils mathUtils = new MathUtils();
	StringUtils stringUtils = new StringUtils();

	@Test
	void testAssertAll() {
		int a = 3;
		int b = 4;
		assertAll(
		  "heading",
		  () -> assertEquals(7, a + b, "should be equal!"),
		  () -> assertTrue(mathUtils.isEvenNumber(6), "should be even number!"),
		  () -> assertFalse(stringUtils.isPalindrome("abcab"), "should be not palindrome")
		);
	}

}
