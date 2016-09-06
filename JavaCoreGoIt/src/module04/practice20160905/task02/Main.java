package module04.practice20160905.task02;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(
                new Point(0,0),
                new Point(0,2),
                new Point(0,4)
        );

        t.print();
    }
}
