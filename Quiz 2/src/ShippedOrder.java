
public class ShippedOrder extends Order{
    ShippedOrder(){
       // super();
    }
    ShippedOrder(String customer_name, int customer_order,int unit_price,int quantity){
        super(customer_name,customer_order,quantity,unit_price);
        //this.quantity = quantity;
    }
    double computePrice(){
        System.out.println("Total price="+super.computePrice()+"$");
        return super.computePrice()+4.00;
        
    }
}