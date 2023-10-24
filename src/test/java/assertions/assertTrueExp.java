package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertTrueExp {
	MathUtils mathUtils = new MathUtils();
	StringUtils stringUtils = new StringUtils();
	
	@Test
	void testIsEvenNumber() {
		int a = 4;
		assertTrue(mathUtils.isEvenNumber(a), "The number should be even number");
	}
	
	@Test
	void testIsPalindrome() {
		String str = "radar";
		assertTrue(stringUtils.isPalindrome(str), "The string should be palindrome");
	}

}
