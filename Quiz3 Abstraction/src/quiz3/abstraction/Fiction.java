
package quiz3.abstraction;
public class Fiction extends Book{
   Fiction() {
       super();
   }
   Fiction(String title){
       super(title);
   }
   public void setPrice(double price){
       super.price = price;
   }
   public String toString(){
       return super.toString()+super.price;
   }
}
