public class programming extends Book{
   String lang;
   programming(){
       super();
       this.lang = "java";
   }
//   programming(String author, String title, int pages, double price, String lang){
//       super(author, title, pages, price);
//       this.lang = lang;
//   }
   void printInfo(){
       super.printInfo();
       System.out.println("the name of the language is: "+lang);
   }
}
