package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class BeforeEachExp {
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each");
	}
	
//	@Test
//	void test_1() {
//		System.out.println("Test 1");
//	}
//	
//	@Test
//	void test_2() {
//		System.out.println("Test 2");
//	}
	
	@RepeatedTest(5)
	void testRepeat(RepetitionInfo repetitionInfo) {
		System.out.println(repetitionInfo.getCurrentRepetition());
	}
}
