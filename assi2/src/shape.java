class sphere extends shape{
    String s = "sphere";
    String draw() {
        return "I draw "+s;}
    double calculateArea(int a){
        return a*2*180*r;}
    }
class cone extends shape{
    String c = "cone";
    @Override
    String draw() {
        return "I draw "+c;}
    double calculateArea(int a){
        return a*180*r*r;}
}
class cylinder extends shape{
    String cy = "cylinder";
    String draw() {
        return "I draw "+cy;}
    double calculateArea(int a){
        return 2*180*r*(r+a);}
}
public class shape {
     double r=5;
    String draw() {
    return "I draw ";}
    double calculateArea(int a){
        return a;}
    public static void main(String[] args) {
        sphere obj = new sphere();
        double sphere = obj.calculateArea(20);
        System.out.println(obj.draw());
        System.out.println("the surface area is: "+sphere+" cm.");
        
        cone obj1 = new cone();
        System.out.println(obj1.draw());
        System.out.println("the surface area is: "+obj1.calculateArea(25)+" cm.");
        
        cylinder obj2 = new cylinder();
        System.out.println(obj2.draw());
        System.out.println("The surface area is: "+obj2.calculateArea(15)+"cm");}   
}