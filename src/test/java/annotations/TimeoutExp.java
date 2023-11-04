package annotations;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import javabrains.APICaller;

class TimeoutExp {
	
//	@Test
//	@Timeout(1)
//	void test_4() throws InterruptedException {
//		Thread.sleep(1001);
//	}
//	
//	@Test
//	@Timeout(value = 1, unit = TimeUnit.SECONDS)
//	void test_5() throws InterruptedException {
//		Thread.sleep(2);
//	}
//
	@Test
	@Timeout(value = 100, unit = TimeUnit.SECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
	void test_3() throws InterruptedException {
		Thread.sleep(6000);
	}
	
	@Test
	@Timeout(value = 100, unit = TimeUnit.SECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
	void test_2() throws InterruptedException {
		Thread.sleep(10000);
	}
	
//	@Test
//    @Timeout(2)
//    public void testApiCall() {
//        String apiUrl = "http://localhost:3000/api/seafoods";
//        String apiResponse = APICaller.callApi(apiUrl);
//        System.out.println(apiResponse);
//    }
}
