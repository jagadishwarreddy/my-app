package io.javabrains;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jagad on 11/05/2020.
 */
class MathUtilsTestSample {

    MathUtils mathUtils =  new MathUtils();

    @Test
    @DisplayName("Test add methods +")
    void testAddPositive() {
        assertEquals(2, mathUtils.add(1, 1), "The add method should add two numbers ");
    }

    @Test
    @DisplayName("Test add methods - ")
    void testAddNegative() {
        assertEquals(-1, mathUtils.add(-3,2));
    }

    @Test
    void computeCircleArea() {

    }

    @Test
    void divide() {

    }

    @Test
    void multiply() {

    }

}