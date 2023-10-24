package annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javabrains.MathUtils;
import javabrains.StringUtils;

class DisplayNameGenerationExp {

	@Nested
	@DisplayNameGeneration(DisplayNameGenerator.Standard.class)
	class TEST_1 {
		@Test
		void add() {
			MathUtils mathUtils = new MathUtils();
			assertEquals(10, mathUtils.add(6, 4));
		}
	}

	@Nested
	@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
	class TEST_2 {
		@ParameterizedTest
		@ValueSource(strings = { "racecar", "radae", "abcba" })
		void testPalindrome(String candidate) {
			StringUtils stringUtils = new StringUtils();
			assertTrue(StringUtils.isPalindrome(candidate), "Must be palindrome string");
		}
	}

	@Nested
	@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
	class TEST_3 {
		@Test
		void isPalindrome() {
			StringUtils stringUtils = new StringUtils();
			assertTrue(StringUtils.isPalindrome("abcba"));
		}
	}

	@Nested
	@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
	class TEST_4 {
		@Test
		void add() {
			MathUtils mathUtils = new MathUtils();
			assertEquals(12, mathUtils.add(3, 9));
		}
	}

}