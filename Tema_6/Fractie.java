public class Fractie {
    private int numerator;
    private int denominator;

    public Fractie(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fractie() {
        this(0, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fractie add(Fractie f2) {
        int commonDenominator = this.denominator * f2.getDenominator();
        int numeratorSum = this.numerator * f2.getDenominator() + f2.getNumerator() * this.denominator;

        Fractie result = new Fractie(numeratorSum, commonDenominator);
        return result.simplify();
    }

    public Fractie simplify() {
        int cmmdc = cmmdc(this.numerator, this.denominator);
        return new Fractie(this.numerator / cmmdc, this.denominator / cmmdc);
    }

    private int cmmdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println("Sum between number, a, b, c and d: ");
        return cmmdc(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fractie fractie = (Fractie) obj;
        Fractie fractieSimplificata = this.simplify();
        Fractie fractieSimplificataObj = fractie.simplify();
        return fractieSimplificata.getNumerator() == fractieSimplificataObj.getNumerator() &&
                fractieSimplificata.getDenominator() == fractieSimplificataObj.getDenominator();
    }

    public static void main(String[] args) {
        Fractie fractie1 = new Fractie(2, 3);
        Fractie fractie2 = new Fractie(3, 4);

        System.out.println("Fractia 1: " + fractie1);
        System.out.println("Fractia 2: " + fractie2);

        Fractie sum = fractie1.add(fractie2);
        System.out.println("Sum: " + sum);

        System.out.println("Fractie 1 == Fractie 2: " + fractie1.equals(fractie2));
        System.out.println("Fractie 1 == Sum: " + fractie1.equals(sum));
    }
}
