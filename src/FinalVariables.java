public class FinalVariables {

    final int MAX_VALUE = 100; //equivalent to a constant in JS

    public void displayMax(){
        System.out.println("Max: "+ MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariables example = new FinalVariables();
        example.displayMax();

        //example.MAX_VALUE = 1001; Cant reset final variables

    }


}
