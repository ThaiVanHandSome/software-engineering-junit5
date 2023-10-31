package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertEqualsExp {

	@Test
	void testAdd() {
		int expected = 7;
		int actual = MathUtils.add(4, 3);
		assertEquals(expected, actual, "Should be equal!");
	}
}
