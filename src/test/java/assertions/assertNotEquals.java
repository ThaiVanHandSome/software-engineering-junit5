package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;
import javabrains.StringUtils;

class assertNotEquals {

	@Test
	void testAdd() {
		int expected = 8;
		int actual = MathUtils.add(4, 3);
		assertNotEquals(expected, actual, "Should not be equal!");
	}

}
