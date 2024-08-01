import java.util.Scanner;
class Students{
    Scanner sc = new Scanner(System.in);
    int roll_no,semester;
    double GPA;
    Students(int a,int b, double c){
        roll_no = a;
        semester = b;
        GPA = c;}
    void get(){
        System.out.print("Enter roll no: ");
        roll_no = sc.nextInt();
        System.out.print("Enter semester: ");
        semester = sc.nextInt();
        System.out.print("Enter GPA: ");
        GPA = sc.nextDouble();}
    void show(){
        System.out.println("Roll no is: "+ roll_no);
        System.out.println("Semester is: "+ semester);
        System.out.println("Gpa is: "+ GPA);
        System.out.println();}
}
public class GPA_Calculator {
    public static void main(String[] args) {
        Students ob1 = new Students(1,2,3.2);
        Students ob2 = new Students(1,2,3.2);
        Students ob3 = new Students(1,2,3.2);
        ob1.get();ob2.get();ob3.get();ob1.show();
        ob2.show();ob3.show();}
}