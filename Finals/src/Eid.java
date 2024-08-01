public class Eid extends Greeting{
   Eid(String []names) {
       super(names);}
   public void Greet(String msg){
       for(int i = 0; i<names.length; i++){
           System.out.println(msg+" to "+super.names[i]);}
   }
}
