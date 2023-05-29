package Tema7.Ex1;

class Rhombus extends Parallelogram {
    public double diagonal1, diagonal2;

    public Rhombus(double side, double angle) {
        super((int) side, (int) side, angle, angle);
        this.diagonal1 = side;
        this.diagonal2 = side;
    }

    public double area() {
        double area = (diagonal1 * diagonal2) / 2;
        return area;
    }
}