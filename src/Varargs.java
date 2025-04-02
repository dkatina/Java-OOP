public class Varargs {

    //Static means this method can be called within the class without an instance of the class
    public static int sum(int... numbers){
        int total = 0;
        for (int num : numbers){
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int varargs = sum(1,2,3,4,5,6,7);
        System.out.println(varargs);
    }
}
