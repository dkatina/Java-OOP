public class Main {
    public static void main(String[] args) {
        Person person = new Person("Dylan", 26, "123 main street", 1234567890);

        //Public field, easily accessible (couldn't do this with age since age is private)
        System.out.println("Person's name " + person.name);
        // Utilizing public method
        person.displayName();

        //Access age using public method
        person.showPersonInfo();

        //Accessible within the same package (OOP-part1 is the package)
        System.out.println("Person's address: "+ person.address);
    }
}
