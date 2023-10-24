package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class assertNotSame {

	@Test
	void testNotSame() {
		Object obj_1 = new Object();
		Object obj_2 = new Object();
		assertNotSame(obj_1, obj_2, "Should be same!");
	}
}
