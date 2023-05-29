package Tema7.Ex1;

class Rectangle extends Parallelogram {
    public Rectangle(int length, int width) {
        super(length, width, 90, 90);
    }

    public double area() {
        double area = side1 * side2;
        return area;
    }
}