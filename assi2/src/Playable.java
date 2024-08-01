interface Playable {
  void play(); 
}
class Football implements Playable{
    public void play(){
        System.out.println("Playing Football");
    }
}
class Volleyball implements Playable{
    public void play(){
        System.out.println("Playing volleyball");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("Playing basketball");
    }
}