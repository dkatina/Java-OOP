public class Person {
    //Main ones
    public String name; //accessible form anywhere
    private int age; //Only accessible within this class

    protected String address; //Accessible within the same package or subclass

    int phone; //default or package privet

    public Person(String name, int age, String Address, int phone){
        this.name = name;
        this.age = age;
        address = Address;
        this.phone = phone;
    }

    public void displayName(){
        System.out.println(("Name " + name));
    }

    //this method is only accessible by other methods in the class
    private void displayAge() {
        System.out.println("Age "+age);
    }

    public void showPersonInfo(){
        displayAge();
    }

}
