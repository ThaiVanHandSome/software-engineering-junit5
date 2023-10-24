package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertNotEquals {
	MathUtils mathUtils = new MathUtils();
	StringUtils stringUtils = new StringUtils();

	@Test
	void testAdd() {
		int expected = 8;
		int actual = mathUtils.add(4, 3);
		assertNotEquals(expected, actual, "Should not be equal!");
	}

}
