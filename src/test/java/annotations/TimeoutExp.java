package annotations;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TimeoutExp {
	
	@Test
	@Timeout(1)
	void test_4() throws InterruptedException {
		Thread.sleep(1001);
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void test_5() throws InterruptedException {
		Thread.sleep(2);
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.MINUTES, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
	void test_3() throws InterruptedException {
		Thread.sleep(60004);
	}
	
	@Test
	@Timeout(value = 6, unit = TimeUnit.MILLISECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
	void test_2() throws InterruptedException {
		Thread.sleep(5000);
	}
	

}
