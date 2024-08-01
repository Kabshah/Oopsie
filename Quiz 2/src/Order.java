public class Order {
  int customer_order,unit_price,quantity,total_price;
  String customer_name;
  Order(){
//      this.customer_name = "Ali";
//      this.customer_order = 123;
//      this.unit_price = 4;
//      this.quantity = 10;
  }
  Order(String customer_name,int customer_order,int quantity,int unit_price){
      this.customer_name = customer_name;
      this.customer_order = customer_order;
      this.quantity = quantity;
      this.unit_price = unit_price;
  }
  void setc_name(String customer_name){
      this.customer_name = customer_name;
  }
  String getc_name(){
      return this.customer_name;
  }
  void setc_order(int customer_order){
      this.customer_order = customer_order;
  }
    int getc_order(){
      return this.customer_order;
  }
    void set_quantity(int quantity){
      this.quantity = quantity;
  }
    int get_quantity(){
      return this.quantity;
  }
    void setunit_price(int unit_price){
      this.unit_price = unit_price;
  }
    int getunit_price(){
      return this.unit_price;}
  double computePrice(){
      return this.unit_price*this.quantity;
  }
}
