public class PrimitivePassByValue {
    public static int modifyPrimitive(int num){
        System.out.println("Entering modify primitive: " + num); //Output 5
        num = 10; //Changes the copy of the variable, not the original one
        System.out.println("Leaving modify primitive: " + num); // Output 10
        return num;
    }

    public static void main(String[] args) {
        int x = 5;
        modifyPrimitive(x); // does not change to 10
        // if we want x to change we would have to set equal to the return of the function
        System.out.println("After modify Primitive: " + x); // Output 5
    }
}