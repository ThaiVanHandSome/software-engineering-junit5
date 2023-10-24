package annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javabrains.MathUtils;
import javabrains.StringUtils;

@Tag("fast")
@Tag("model")
@Disabled("Disabled")
class DisableExp {

	@Test
	@Tag("taxes")
	void testingTaxCalculation() {
	}

	@Test
	@Tag("taxes")
	@Disabled("Disabled")
	void testingTaxCalculation_2() {
	}
	
//	@Nested
//	@Order(2)
//	@ExtendWith(DisableNestedExt)
//	class PrimaryTests{
//		@Test
//		void test_1() {
//			MathUtils mathUtils = new MathUtils();
//			assertEquals(10, mathUtils.add(6, 4));
//		}
//	}
//	
//	@Nested
//	@Order(1)
//	class SecondaryTests{
//		@Test
//		void test_2() {
//			StringUtils stringUtils = new StringUtils();
//			assertTrue(StringUtils.isPalindrome("abcba"));
//		}
//	}

}