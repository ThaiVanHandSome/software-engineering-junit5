package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertFalseExp {
	
	@Test
	void testIsEvenNumber() {
		int a = 5;
		assertFalse(MathUtils.isEvenNumber(a), "The number should be not even number");
	}
	
	@Test
	void testIsPalindrome() {
		String str = "radae";
		assertFalse(StringUtils.isPalindrome(str), "The string should be not palindrome");
	}
}
