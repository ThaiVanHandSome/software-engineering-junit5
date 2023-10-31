package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javabrains.MathUtils;

@DisplayName("A special test case")
class DisplayNameExp {
	
	@Test
	@DisplayName("Add 2 numbers")
	void add() {
		assertEquals(10, MathUtils.add(6, 4));
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
