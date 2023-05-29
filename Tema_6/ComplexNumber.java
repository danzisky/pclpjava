public class ComplexNumber {
    private double real, imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber init(double real, double imag) {
        return new ComplexNumber(real, imag);
    }
    /* getters */
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imag;
    }

    /* setters */

    public void setReal(double real) {
        this.real = real;
    }
    public void setImaginary(double imag) {
        this.imag = imag;
    }

    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    /* methods */
    public double add(double a, double b) {
        return a + b;
    }

    public ComplexNumber addReal(double r) {
        this.real = r + this.getReal();
        return this;
    }
    public ComplexNumber addIm(double r) {
        this.imag = r + this.getImaginary();
        return this;
    }
    public ComplexNumber add(ComplexNumber c) {
        this.real = c.getReal() + this.getReal();
        this.real = c.getImaginary() + this.getImaginary();
        return this;
    }
    /* ======================= subtraction ======================== */
    public double subtract(double a, double b) {
        return a + b;
    }

    public ComplexNumber subtractReal(double r) {
        this.real = this.getReal() - 5;
        return this;
    }
    public ComplexNumber subtractIm(double r) {
        this.imag = this.getImaginary() - r;
        return this;
    }
    public ComplexNumber subtract(ComplexNumber c) {
        this.real = this.getReal() - c.getReal();
        this.real = this.getImaginary() - c.getImaginary();
        return this;
    }

    public double absValue() {
        return (double) Math.sqrt(Math.pow(this.real, 2.00) + Math.pow(this.imag, 2.00));
    }
}
