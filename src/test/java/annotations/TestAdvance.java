package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAdvance {
	
	int a = 1;

	@Test
	void test_1() {
		assertEquals(1, a);
		a += 1;
	}
	
	@Test
	void test_2() {
		assertEquals(1, a);
		a += 1;
	}
}

