package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class AfterAllExp {

	@AfterAll
	static void testAfterAll() {
		System.out.println("After All!");
	}

	@AfterEach
	void testAfterEach() {
		System.out.println("After Each!");
	}
	
	@RepeatedTest(value = 5, name = "Repeat 1")
	void testRepeat_1(RepetitionInfo repetitionInfo) {
		System.out.println("Repeat 1 " + repetitionInfo.getCurrentRepetition());
	}
	
	@RepeatedTest(value = 6, name = "Repeat 2")
	void testRepeat_2(RepetitionInfo repetitionInfo) {
		System.out.println("Repeat 2 "+ repetitionInfo.getCurrentRepetition());
	}

}
