package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertAllExp {

	@Test
	void testAssertAll() {
		int a = 3;
		int b = 4;
		assertAll(
		  "heading",
		  () -> assertEquals(7, a + b, "should be equal!"),
		  () -> assertTrue(MathUtils.isEvenNumber(6), "should be even number!"),
		  () -> assertFalse(StringUtils.isPalindrome("abcab"), "should be not palindrome")
		);
	}

}
