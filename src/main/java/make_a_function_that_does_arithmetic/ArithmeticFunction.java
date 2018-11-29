package make_a_function_that_does_arithmetic;

public class ArithmeticFunction {
    /*
    Given two numbers and an arithmetic operator (the name of it, as a string), return the result
    of the two numbers having that operator used on them.
    a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
    The four operators are "add", "subtract", "divide", "multiply".
     */

    public static int arithmetic(int a, int b, String operator) {
        if (a < 0 || b < 0) {
            System.out.println("a and b will both be positive integers");
            return 0;
        } else {
            switch (operator) {
                case "add": return a + b;
                case "subtract": return a - b;
                case "multiply": return a * b;
                case "divide": return a / b;
                default: return 0;
            }
        }
    }
}
