package io.javabrains;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Created by jagad on 11/05/2020.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

    MathUtils mathUtils;
    TestInfo testInfo;
    TestReporter testReporter;


    @BeforeAll
    static void beforeAllInit() {
        System.out.println("This needs to be run before all ...");
    }

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;

        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanUp() {
        System.out.println("Cleaning Up ....");
    }

    @Nested
    @Tag("Math")
    class AddTest {

        @Test
        @DisplayName("Testing add method positive")
        void addPositive() {

            int expected = 4;
            int actual = mathUtils.add(1, 3);

//            assertEquals(expected, actual, "should retuen sum " + expected + " but retuerned " + actual);
            assertEquals(expected, actual, () -> "should retuen sum " + expected + " but retuerned " + actual);
        }

        @Test
        @DisplayName("Testing add method negative")
        void addNegative() {
            assertEquals(-1, mathUtils.add(1, -2), "add method should result should match expected result !!");
        }
    }

    @Test
    void divide() {
        boolean isServerUp = false;
        assumeTrue(isServerUp);

        assertThrows(ArithmeticException.class, () -> {
            mathUtils.divide(1, 0);
        }, "divide by zero");
//      mathUtils.divide(1, 0);
    }

    @Test
    @DisplayName(" multiply  method")
    @Tag("Math")
    void multiply() {
        System.out.println("Running " + testInfo.getDisplayName() + " with Tags " +  testInfo.getTags());
        testReporter.publishEntry("Running " + testInfo.getDisplayName() + "with  Tags " + testInfo.getTags());
        assertAll(
                () -> assertEquals(2, mathUtils.multiply(2, 1)),
                () -> assertEquals(4, mathUtils.multiply(2, 2))
        );
    }

    @Test
    @Disabled
    @DisplayName("TDD Method ..Should not run...")
    void testDisabled() {
        fail("The test should be disabled !!");
    }
}