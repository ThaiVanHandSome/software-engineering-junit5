package assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class assertTimeoutExp {

	@Test
	void testTimeout() {
		assertTimeout(Duration.ofSeconds(2), () -> {
			Thread.sleep(3000);
		});
	}


}
