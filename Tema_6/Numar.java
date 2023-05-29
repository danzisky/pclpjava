public class Numar {
    private int nr;

    public Numar(int number) {
        this.nr = number;
    }

    public int getNr() {
        return this.nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
    public int suma(int a) {
        return this.nr + a;
    }
    public int suma(int a, int b) {
        return this.nr + a + b;
    }
    public int suma(int a, int b, int c) {
        return this.nr + a + b + c;
    }
    public int suma(int a, int b, int c, int d) {
        return this.nr + a + b + c + d;
    }

    public static void main(String[] args) {
        Numar number = new Numar(5);
        int a, b, c, d;
        a =1; b = 3; c =4; d = 7;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("number: " + number.getNr());
        System.out.println("Sum between number and a: " + number.suma(a));
        System.out.println("Sum between number, a and b: " + number.suma(a, b));
        System.out.println("Sum between number, a, b and c: " + number.suma(a, b, c));
        System.out.println("Sum between number, a, b, c and d: " + number.suma(a, b, c, d));

    }
}
