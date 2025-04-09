public class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // Method with an object parameter
    public static void modifyObjectValue(Point point) {
        point.x = 10;  // Modifies the original object (the reference is copied)
    }

    public static void main(String[] args) {

        // Object type example
        Point p = new Point(1, 2);
        modifyObjectValue(p);
        System.out.println("After modifyObjectValue: " + p.x + ", " + p.y);  // Output: 10, 2

    }
}
