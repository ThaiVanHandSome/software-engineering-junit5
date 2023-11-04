package assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javabrains.MathUtils;

class assertSame {

	@Test
	void testSame() {
		Object obj_1 = new Object();
		Object obj_2 = obj_1;
		assertSame(obj_1, obj_2, "Should be same!");
	}
	
	@Test
	void test() {
		Object obj_1 = new Object();
		Object obj_2 = obj_1;
		assertSame(obj_1, obj_2, "Should be same!");
		assertTrue(MathUtils.isEvenNumber(4));
	}
	
//	@Test
//	void test_2() {
//		int a = 3;
//		int b = a;
//		assertSame(a, b, "Should be same!");
//	}

}
