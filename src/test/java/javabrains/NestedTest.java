package javabrains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {
    @BeforeEach()
    void beforeEach() {
        System.out.println("NestedTest.beforeEach()");
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
