public class Book {
  String author, title;
  int pages;
  double price;
  Book(){
      this.author = "JK Rowling";
      this.title = "Harry Potter";
      this.pages = 234;
      this.price = 99.5;}
  Book(String author, String title, int pages, double price ){
      this.author = author;
      this.title = title;
      this.pages = pages;
      this.price = price;
  }
  void setAuthor(String author){
      this.author = author;
  }
  String getAuthor(){
      return this.author;
  }
  void setTitle(String title){
      this.title = title;
  }
  String getTitle(){
      return this.title;
  }
  void setPages(int pages){
      this.pages = pages;
  }
  int getPages(){
      return this.pages;
  }
  void setPrice(double price){
      this.price = price;
  }
  double getPrice(){
      return this.price;
  }
  void printInfo(){
      System.out.println("the name of author is: "+author);
      System.out.println("the name of title of book is: "+title);
      System.out.println("the number of pages is: "+pages);
      System.out.println("the price of book is "+price);
  }
}
