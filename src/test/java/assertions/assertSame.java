package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class assertSame {

	@Test
	void testSame() {
		Object obj_1 = new Object();
		Object obj_2 = obj_1;
		assertSame(obj_1, obj_2, "Should be same!");
	}

}
