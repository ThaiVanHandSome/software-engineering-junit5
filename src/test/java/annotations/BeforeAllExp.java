package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class BeforeAllExp {

	@AfterAll
	static void testAfterAll() {
		System.out.println("After All!");
	}
	
	@BeforeAll
	static void testBeforeAll() {
		System.out.println("Before All!");
	}

	@BeforeEach
	void testAfterEach() {
		System.out.println("Before Each!");
	}
	
	@RepeatedTest(value = 5, name = "Repeat 1")
	void testRepeat_1(RepetitionInfo repetitionInfo) {
		System.out.println("Repeat 1 " + repetitionInfo.getCurrentRepetition());
	}

}
