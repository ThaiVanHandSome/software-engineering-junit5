package javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class AfterTest {
	
	@AfterEach
	public void initEach() {
		System.out.println("BeforeEach initEach() method called");
	}
	
	@AfterAll
	public static void init() {
		System.out.println("BeforeEach init() method called");
	}

	@RepeatedTest(5)
	void test(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("test -> " + repetitionInfo.getCurrentRepetition());
	}
	
	

}
