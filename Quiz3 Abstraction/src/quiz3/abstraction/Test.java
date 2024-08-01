
package quiz3.abstraction;
public class Test {
    public static void main(String[] args) {
        Fiction f1 = new Fiction("f1=");
        f1.setPrice(24.99);
        NonFiction nf1 = new NonFiction("NF1=");
        nf1.setPrice(37);
        Book b1[] = {f1,nf1};
        for(int i = 0; i < b1.length; i++){
            System.out.println(b1[i].toString());
        }
    }
}
