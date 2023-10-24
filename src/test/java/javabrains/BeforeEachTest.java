package javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class BeforeEachTest {
	
	@BeforeEach
	public void initEach() {
		System.out.println("BeforeEach initEach() method called");
	}
	
	@BeforeAll
	public static void init() {
		System.out.println("BeforeEach init() method called");
	}

	@RepeatedTest(5)
	void test(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("test -> " + repetitionInfo.getCurrentRepetition());
	}
	
	

}
