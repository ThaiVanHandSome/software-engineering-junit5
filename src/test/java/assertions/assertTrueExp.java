package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertTrueExp {
	
	@Test
	void testIsEvenNumber() {
		int a = 5;
		assertTrue(MathUtils.isEvenNumber(a), "The number should be even number");
	}
	
	@Test
	void testIsPalindrome() {
		String str = "radar";
		assertTrue(StringUtils.isPalindrome(str), "The string should be palindrome");
	}

}
