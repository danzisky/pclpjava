package Tema7;

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    public double area() {
        double area = side1 * side1;
        return area;
    }
}
