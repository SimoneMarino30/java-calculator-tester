package calculation;

public class Calculator {
    // METHODS
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float divide(float num1, float num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("The second value must be a number different from 0");
        }
        return num1 / num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
