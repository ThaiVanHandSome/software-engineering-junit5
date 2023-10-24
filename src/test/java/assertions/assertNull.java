package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class assertNull {

	@Test
	void testNull() {
		Object obj = null;
		assertNull(obj, "Should be null!");
	}

}
