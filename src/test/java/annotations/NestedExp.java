package annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javabrains.MathUtils;
import javabrains.StringUtils;

class NestedExp {
	MathUtils mathUtils = new MathUtils();

//	@Nested
//	class FirstNestedClass {
//		@Test
//		void test() {
//			int a = (int) (Math.random() * 100);
//			int b = (int) (Math.random() * 100);
//			int expected = a + b;
//			int actual = mathUtils.add(a, b);
//			assertEquals(expected, actual, "The add method should add 2 numbers");
//		}
//	}
//
//	@Nested
//	class SecondNestedClass {
//		@ParameterizedTest
//		@ValueSource(strings = { "racecar", "radar", "vav" })
//		void testPalindrome(String candidate) {
//			assertTrue(StringUtils.isPalindrome(candidate), "The string should be palindrome");
//		}
//	}

//	@Nested
//	class FirstNestedClass {
//		@Test
//		void test() {
//			System.out.println("FirstNestedClass.test()");
//		}
//	}
//
//	@Nested
//	class SecondNestedClass {
//		@Test
//		void test() {
//			System.out.println("SecondNestedClass.test()");
//		}
//	}
	
	@BeforeEach()
    void beforeEach() {
        System.out.println("NestedExp.beforeEach()");
    }

    @Nested
    class FirstNestedClass {
        @BeforeEach()
        void beforeEach() {
            System.out.println("FirstNestedClass.beforeEach()");
        }

        @Test
        void test() {
            System.out.println("FirstNestedClass.test()");
        }
        
        // thêm trường hợp 2 test
        @Test
        void test2() {
            System.out.println("FirstNestedClass.test2()");
        }
    }

    @Nested
    class SecondNestedClass {
        @BeforeEach()
        void beforeEach() {
            System.out.println("SecondNestedClass.beforeEach()");
        }

        @Test
        void test() {
            System.out.println("SecondNestedClass.test()");
        }
   }
}
