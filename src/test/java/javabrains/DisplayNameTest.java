package javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A special test case")
class DisplayNameTest {
	
	@Test
	@DisplayName("Add 2 numbers")
	void add() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(10, mathUtils.add(6, 4));
	}
	
	@Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName("😱")
    void testWithDisplayNameContainingEmoji() {
    }

}
