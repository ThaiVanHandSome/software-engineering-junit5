package annotations;

import static org.junit.jupiter.api.Assertions.*;
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
//@Disabled("Disabled")
class DisableExp {

	@Test
	@Tag("caculate")
	void testingTaxCalculation() {
		int actual = MathUtils.add(4, 5);
		assertEquals(9, actual);
	}

	@Test
	@Tag("caculate")
	@Disabled("Disabled")
	void testingTaxCalculation_2() {
		int actual = MathUtils.subtract(5, 4);
		assertEquals(1, actual);
	}
}