public class r48 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            // This will cause ArithmeticException
            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Program continues after try-catch.");
    }
}
