public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator!");
        addition(5, 3); 
        subtraction(5, 3);
	multiplication(5, 3);
	division(5, 3);
    }

    public static void addition(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public static void subtraction(int a, int b) {
    	System.out.println("Subtraction: " + (a - b));
    }

    public static void multiplication(int a, int b) {
    	System.out.println("Multiplication: " + (a * b));
    }

    public static void division(int a, int b) {
    	System.out.println("Division: " + (a / b));
    }


}