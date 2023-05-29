package Tema7;

class Parallelogram extends Quadrilateral {
    public Parallelogram(int side1, int side2, double angle1, double angle2) {
        super(side1, side2, side1, side2, angle1, angle2, angle1, angle2);
    }

    public double area() {
        double area = side1 * side2 * Math.sin(angle1);
        return area;
    }
}