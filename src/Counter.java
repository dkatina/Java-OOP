public class Counter {
    // Public static variable shared among all instances
    public static int count = 0;


    public static void main(String[] args) {

        Counter.count ++;
        System.out.println("COunter after first modification: "+ Counter.count);

        Counter c1 = new Counter();
        System.out.println("Counter for new instance: " + c1.count);

        c1.count++; //Modifys the count of the Class itself
        System.out.println("Counter after modifing instance: "+ Counter.count);

        Counter c2 = new Counter();
        System.out.println("Counter for new instance: " + c2.count); //Shares the count with c1
    }
}
