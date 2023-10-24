package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import javabrains.StringUtils;

class EachAllExpDetail {

	static String input;
	
	@BeforeAll
	static void setUp() {
		input = "abc1234A!";
	}
	
	@Test
	void testEquals() {
		assertTrue(StringUtils.containsAllTypes(input));
	}
	
	@AfterAll
	static void cleanUp() {
		input = null;
	}
}
