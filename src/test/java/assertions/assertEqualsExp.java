package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertEqualsExp {
	MathUtils mathUtils = new MathUtils();
	StringUtils stringUtils = new StringUtils();

	@Test
	void testAdd() {
		int expected = 7;
		int actual = mathUtils.add(4, 3);
		assertEquals(expected, actual, "Should be equal!");
	}
}
