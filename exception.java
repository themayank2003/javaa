public class ExceptionHandlingExample {

    // Method that throws an exception using 'throws'
    public static void riskyMethod(int num) throws Exception {
        if (num < 0) {
            // Throwing an exception using 'throw'
            throw new Exception("Negative numbers are not allowed!");
        } else {
            System.out.println("Number is: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            // Trying a block of code that might throw an exception
            riskyMethod(-5);
        } catch (Exception e) {
            // Catching the exception thrown by riskyMethod
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Finally block that always executes, regardless of an exception being thrown or not
            System.out.println("This block is always executed.");
        }

        System.out.println("Program continues after try-catch-finally block.");
    }
}
