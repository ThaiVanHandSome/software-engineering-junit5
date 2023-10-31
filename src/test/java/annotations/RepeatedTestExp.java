package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import javabrains.MathUtils;

class RepeatedTestExp {
	
	MathUtils mathUtils = new MathUtils();

	@RepeatedTest(5)
	void testAddRepeated() {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int expected = a + b;
		int actual = MathUtils.add(a, b);
		assertEquals(expected, actual, "The add method should add 2 numbers");
	}
	
	@RepeatedTest(5)
	void testIsEvenNumber() {
		int a = (int) (Math.random() * 100);
		assertTrue(MathUtils.isEvenNumber(a), "The number should be even number");
	}
	
	@RepeatedTest(value = 5, failureThreshold = 1)
	void testIsEvenNumberWithThreshold() {
		int a = (int) (Math.random() * 100);
		assertTrue(MathUtils.isEvenNumber(a), "The number should be even number");
	}
	
	@RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
	void testAddNumberWithName() {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int expected = a + b;
		int actual = MathUtils.add(a, b);
		assertEquals(expected, actual, "The add method should add 2 numbers");;
	}
	
	@RepeatedTest(value = 5, name = "Custom name {currentRepetition} / {totalRepetitions}")
	void testAddNumberWithCustomName() {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int expected = a + b;
		int actual = MathUtils.add(a, b);
		assertEquals(expected, actual, "The add method should add 2 numbers");
	}
	
	@RepeatedTest(5)
	void testAddNumberWithReInfo(RepetitionInfo repetitionInfo) {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int expected = a + b;
		int actual = MathUtils.add(a, b);
		System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition());
		System.out.println("Repetition total #" + repetitionInfo.getTotalRepetitions());
		assertEquals(expected, actual, "The add method should add 2 numbers");
	}
}
