package module04.practice20160905.task02;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double slideAB;
    private double slideBC;
    private double slideCA;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.slideAB = getLength(pointA, pointB);
        this.slideBC = getLength(pointB, pointC);
        this.slideCA = getLength(pointC, pointA);

        System.out.println("slide AB = " + slideAB);
        System.out.println("slide BC = " + slideBC);
        System.out.println("slide CA = " + slideCA);

        String not = "";
        if (!isTriangle()) {
            not = "not ";
        }
        System.out.println("It is " + not + "a triangle");
    }

    private double getLength(Point point1, Point point2) {
        return Math.sqrt(
                Math.pow(point1.getX() - point2.getX(), 2) +
                Math.pow(point1.getY() - point2.getY(), 2)
        );
    }

    private boolean isTriangle() {
        if (slideAB >= slideBC + slideCA) {
            return false;
        } else if (slideBC >= slideAB + slideCA) {
            return false;
        } else if (slideCA >= slideAB + slideBC) {
            return false;
        } else
            return true;
    }

    private double calcPerimeter() {
        return slideAB + slideCA + slideBC;
    }

    private double calcArea() {
        double halfPerimeter = calcPerimeter() / 2;
        return Math.sqrt(
                halfPerimeter
                 * (halfPerimeter - slideAB)
                 * (halfPerimeter - slideBC)
                 * (halfPerimeter - slideCA)
        );
    }

    void print() {
        System.out.println("Perimeter : " + calcPerimeter()
                + "\nArea : " + calcArea());
    }
}
