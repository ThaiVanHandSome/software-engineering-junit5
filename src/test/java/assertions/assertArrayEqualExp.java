package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class assertArrayEqualExp {

	@Test
	void testArrayEqual() {
		int[] expectedArray = { 1, 2, 3, 4, 5 };
		int[] actualArray = { 1, 2, 3, 4, 5 };

		assertArrayEquals(expectedArray, actualArray, "Should be array equal!");
	}

}
