package annotations;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
@Tag("model")
class TagExp {

	@Test
	@Tag("taxes1")
	void testingTaxCalculation() {
	}

	@Test
	@Tag("taxes")
	void testingTaxCalculation_2() {
	}

}