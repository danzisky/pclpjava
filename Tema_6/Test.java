public class Test {
    public static void main(String[] args) {
        Punct pA = new Punct(1, 2);
        Punct pB = new Punct(-1, 3);

        double distAlaB = pA.distance(pB);
        System.out.println("The distance between point A and B is: "+ (float) distAlaB);
    }
}
