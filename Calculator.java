public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator!");
        addition(5, 3); 
        subtraction(5, 3);
    }

    public static void addition(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public static void subtraction(int a, int b) {
    	System.out.println("Subtraction: " + (a - b));
    }

}