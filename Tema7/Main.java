package Tema7;

public class Main {
    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral(3, 4, 5, 6);
        System.out.println("Quadrilateral perimeter: " + quadrilateral.perimeter());

        Parallelogram parallelogram = new Parallelogram(5, 6, 30, 150);
        System.out.println("Parallelogram area: " + parallelogram.area());

        Rhombus rhombus = new Rhombus(8, 60);
        System.out.println("Rhombus area: " + rhombus.area());

        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("Rectangle area: " + rectangle.area());

        Square square = new Square(5);
        System.out.println("Square area: " + square.area());
    }
}