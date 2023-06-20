package calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    //ATTRIBUTES
    private Calculator calculator;

    // prima di ogni test inizializzo Calculator
    @BeforeEach
    void init() {
        // System.out.print("Before each test");
        calculator = new Calculator();
    }

    //-------------------------------------ADDITION---------------------------------------

    @Test
    @DisplayName("Test addition positive")
    void addPositive() {
        float result = calculator.add(6.0f, 4.0f);
        assertEquals(10.0f, result, "The addition's result must be 10");
    }

    @Test
    @DisplayName("Test addition negative")
    void addNegative() {
        float result = calculator.add(-6.0f, -4.0f);
        assertEquals(-10.0f, result, "The addition's result must be -10");
    }

    //-------------------------------------SUBTRACTION--------------------------------------

    @Test
    @DisplayName("Test subtraction positive")
    void subtractPositive() {
        float result = calculator.subtract(6.0f, 4.0f);
        assertEquals(2.0f, result, "The subtraction's result must be 2");
    }

    @Test
    @DisplayName("Test subtraction negative")
    void subtractNegative() {
        float result = calculator.subtract(-6.0f, -4.0f);
        assertEquals(-2.0f, result, "The subtraction's result must be -2");
    }

    //-------------------------------------DIVISION----------------------------------------

    @Test
    @DisplayName("Test division")
    void divide() {
        float result = calculator.divide(6.0f, 3.0f);
        assertEquals(2.0f, result, "The division's result must be 2");
    }
    @Test
    @DisplayName("Test division for 0")
    void divideForZero() {
        //Solleva IllegalArgumentException divisione per zero
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10.0f, 0.0f));
    }

    @Test
    @DisplayName("Test division negative")
    void divideNegative() {
        //Solleva IllegalArgumentException divisione per numero negativo
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10.0f, -2.0f));
    }

    //-------------------------------------MULTIPLICATION-------------------------------------

    @Test
    @DisplayName("Test multiplication positive")
    void multiplyPositive() {
        float result = calculator.multiply(6.0f, 4.0f);
        assertEquals(24.0f, result, "The multiplication's result must be 24");
    }

    @Test
    @DisplayName("Test multiplication negative")
    void multiplyNegative() {
        float result = calculator.multiply(-6.0f, -4.0f);
        assertEquals(24.0f, result, "The multiplication's result must be 24");
    }
}