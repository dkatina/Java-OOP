public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println(add(5, 10));          // Calls the first add method
        System.out.println(add(5.5, 10.5));      // Calls the second add method
        System.out.println(add(5, 10, 15));      // Calls the third add method
    }

    //Method 1: Adding two integers
    public static int add(int a, int b){
        System.out.println("Method 1 called");
        return a + b;
    }

    // Method 2: Adding two doubles
    public static double add(double a, double b){
        System.out.println("Method 2 called");
        return a + b;
    }

    // Method 3: Adding three integers
    public static int add(int a, int b, int c){
        System.out.println("Method 3 called");
        return a + b + c;
    }
}