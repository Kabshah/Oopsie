
package quiz3.abstraction;
public abstract class Book {
    String title;
    double price;
    Book(){
    }
    Book(String title){
        this.title=title;
    }
    String getTitle(){
        return this.title;
    }
    double getPrice(){
        return this.price;
    }
    abstract void setPrice(double price);
    public String toString(){
        return this.title;
    }
}
