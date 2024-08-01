
package quiz3.abstraction;
public class NonFiction extends Book{
   NonFiction() {
       
   }
   NonFiction(String title){
       super(title);
   }
   public void setPrice(double price){
       super.price = price;
   }
   public String toString(){
       return super.toString()+super.price;
   }
}
