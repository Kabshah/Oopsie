
package week2exp;
import java.util.Scanner;
public class Week2Exp {
    public static void main(String[] args) {
        // TODO code application logic here
        double radius,area;
        Scanner input = new Scanner(System.in);
        final double PI = 3.146;
        System.out.println("Enter radius:");
        radius = input.nextDouble();
        if (radius >= 0)
        { 
           area=PI * Math.pow(radius,2.0);
            System.out.println("area="+area);
        }
        else
        {
            System.out.println("radius is negative.");
        }
        // 2nd Prog Marksheet
        
        double s1, s2, s3, s4, s5,sum, per;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of s1:");
        s1 = sc.nextDouble();
        System.out.println("Enter your marks of s2:");
        s2 = sc.nextDouble();
        System.out.println("Enter your marks of s3:");
        s3 = sc.nextDouble();
        System.out.println("Enter your marks of s4:");
        s4 = sc.nextDouble();
        System.out.println("Enter your marks of s5:");
        s5 = sc.nextDouble();
        sum = s1+s2+s3+s4+s5;
        per = sum/500*100.0;
        System.out.println("Your percentage = " + per);
        if (per >=50 && per < 60)
        {
            grade = 'D';
        }
        else if (per >= 60 && per < 70)
        {
            grade = 'C';
        }
        else if (per>= 70 && per < 80)
        {
            grade = 'B';
        }
        else if (per >= 80 && per < 100)
        {
            grade = 'A';
        }
        else
        {
            grade = 'F';
        }
        
        System.out.println("grade= "+ grade);
        
        //int string to int conversion
        String intString = "123";
        int intValue = Integer.parseInt(intString);
        System.out.println(intValue);
        //double string to actual double conversion
        String doubleString = "3.14";
        System.out.println(doubleString);
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("Parsed: "+doubleValue);
        //int to string int conversion
        int number = 23;
        String s = number +"";
        System.out.println("coverted no: "+s);
    }
    
}
