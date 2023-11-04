package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class TestOrderExp {

	private static StringBuilder output = new StringBuilder("");

	@Test
	void firstTest() {
		output.append("a");
	}

	@Test
	void secondTest() {
		output.append("b");
	}

	@Test
	void thirdTest() {
		output.append("c");
	}

	@AfterAll
	public static void assertOutput() {
		assertEquals("abc", output.toString());
	}

}
