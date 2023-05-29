package Tema7;

public class Quadrilateral {
    public int side1, side2, side3, side4;
    public double angle1, angle2, angle3, angle4;

    public Quadrilateral() {
        this(0, 0, 0, 0);
    }

    public Quadrilateral(int side1, int side2, int side3, int side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public Quadrilateral(double angle1, double angle2, double angle3, double angle4) {
        this(0, 0, 0, 0, angle1, angle2, angle3, angle4);
    }

    public Quadrilateral(int side1, int side2, int side3, int side4,
            double angle1, double angle2, double angle3, double angle4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
        this.angle4 = angle4;
    }

    public int perimeter() {
        int result = side1 + side2 + side3 + side4;
        return result;
    }
}
