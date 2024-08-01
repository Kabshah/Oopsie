
public class Test {
    public static void main(String[] args) {
        Acalc a1 = new Acalc("Inherited class A");
       // Acalc a2[] = {new Acalc("a"),new Acalc("B")};
        System.out.println(a1.toString());
        a1.add(1,3,5,7,9);
        a1.sub(10,5);
        a1.mul(10, 1);
        a1.asquare(5.0);
        a1.atriangle(10,5);
        //System.out.println(a2[0].toString());
    }
}
