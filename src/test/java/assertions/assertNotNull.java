package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class assertNotNull {

	@Test
	void testNotNull() {
		Object obj = new Object();
		assertNotNull(obj, "Should be not null!");
	}

}
