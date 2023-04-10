public class Test {
    public static void main(String[] args) {
        System.out.println("Ex1. Punct");
        Punct pA = new Punct(1, 2);
        Punct pB = new Punct(-1, 3);
        
        double distAlaB = pA.distance(pB);
        System.out.println("The distance between point A and B is: "+ (float) distAlaB);
        System.out.println("End of Ex1");
        
        System.out.println("\nEx2. ComplexNumber");
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(-1, 3);
        System.out.println("The sum of complex number " + c1 + " and " + c2+ " is: " + c1.add(c2));
        System.out.println("Their absolute values are " + c1 + " and " + c2 + "respectively");
    }
}
