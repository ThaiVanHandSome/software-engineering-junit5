package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertFalseExp {
	MathUtils mathUtils = new MathUtils();
	StringUtils stringUtils = new StringUtils();
	
	@Test
	void testIsEvenNumber() {
		int a = 5;
		assertFalse(mathUtils.isEvenNumber(a), "The number should be not even number");
	}
	
	@Test
	void testIsPalindrome() {
		String str = "radae";
		assertFalse(stringUtils.isPalindrome(str), "The string should be not palindrome");
	}
}
