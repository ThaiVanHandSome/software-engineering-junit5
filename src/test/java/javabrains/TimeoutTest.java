package javabrains;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TimeoutTest {

	@Test
	@Timeout(value = 1, unit = TimeUnit.MINUTES, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
	void test_3() throws InterruptedException {
		Thread.sleep(60004);
	}
	@Test
	@Timeout(6)
	void test() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	@Test
	@Timeout(value = 6, unit = TimeUnit.MILLISECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
	void test_2() throws InterruptedException {
		Thread.sleep(5000);
	}
	

}
