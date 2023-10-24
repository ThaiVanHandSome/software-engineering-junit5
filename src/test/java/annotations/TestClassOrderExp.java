package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import javabrains.MathUtils;
import javabrains.StringUtils;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
class TestClassOrderExp {
	@Nested
	@Order(2)
	class PrimaryTests{
		@Test
		void test_1() {
			MathUtils mathUtils = new MathUtils();
			assertEquals(10, mathUtils.add(6, 4));
		}
	}
	
	@Nested
	@Order(1)
	class SecondaryTests{
		@Test
		void test_2() {
			StringUtils stringUtils = new StringUtils();
			assertTrue(StringUtils.isPalindrome("abcba"));
		}
	}

}
