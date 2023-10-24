package javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class OrderTest {

	MathUtils mathUtils = new MathUtils();

	@Test
	@Order(2)
	void test_1() {
		int num = mathUtils.getNum();
		assertEquals(12, num);
	}

	@Test
	@Order(1)
	void test_2() {
		mathUtils.setNum(12);
	}

}
