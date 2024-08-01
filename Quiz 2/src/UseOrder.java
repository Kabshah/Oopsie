public class UseOrder {
    public static void main(String[] args) {
        ShippedOrder o1 = new ShippedOrder("abc",123,4,10);
        //System.out.println("idk"+o1.computePrice()+"$");
        o1.computePrice();
    }
}
/*Create a class named Order that performs order processing single item. The clash has five 
fields: customer name, customer number, quantity ordered, unit price, and total price.
Include set and get methods for each field except total price. The set methods prompt the 
user for values for each field.This class also needs a method to compute the 
total price(quantity times the unit price) and a method to display the field values. 
create a subclass named ShippedOrder that overrides computePrice() by adding a shipping and 
handling charge of $4.00.write an application named UserOrder that instantiates an object of 
each of these classes. prompt the user for data for the Order object and display the result. 
then prompt the user for data for the ShippedOrder object and display the results.*/