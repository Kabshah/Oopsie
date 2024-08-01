public class Birthday extends Greeting {
    Birthday(String [] names){
        super(names);
    }@Override
    public void Greet(String msg){
        for(int i = 0; i<names.length; i++){
            System.out.println(msg+" to "+super.names[i]);}
    }
}
