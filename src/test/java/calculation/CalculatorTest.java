package calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    //ATTRIBUTES
    Calculator calculator;
    @BeforeEach
    void init() {
        // System.out.print("Before each test");
        // prima di ogni test inizializzo Calculator
        calculator = new Calculator();
    }
    @Test
    @DisplayName("Test addition")
    void add() {
        float result = calculator.add(6.0f, 4.0f);
        assertEquals(10.0f, result, "The addition's result must be 10");
    }

    @Test
    @DisplayName("Test subtraction")
    void subtract() {
        float result = calculator.subtract(6.0f, 4.0f);
        assertEquals(2.0f, result, "The subtraction's result must be 2");
    }

    @Test
    @DisplayName("Test division")
    void divide() {
        float result = calculator.divide(6.0f, 3.0f);
        assertEquals(2.0f, result, "The division's result must be 2");
    }
    @Test
    @DisplayName("Test division for 0")
    void divideForZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10.0f, 0.0f));
    }

    @Test
    @DisplayName("Test multiplication")
    void multiply() {
        float result = calculator.multiply(6.0f, 4.0f);
        assertEquals(24.0f, result, "The multiplication's result must be 24");
    }
}