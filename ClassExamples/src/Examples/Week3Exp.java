package Examples;
import java.util.Scanner;
public class Week3Exp {
    public static void main(String[] args) {
        int ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice:");
        ch = input.nextInt();
        switch(ch)
        {
            case 1:
                double area,radius;
                final double PI = 3.1416;
                System.out.println("Enter Radius:");
                radius = input.nextDouble();
                area = PI * Math.pow(radius,2.0);
                System.out.println("Area= "+ area);
                break;
            case 2:
            int no1,no2,ans;
            char ch1;
            System.out.println("Press 'a''A''+' for adittion");
            System.out.println("Press 's''S''-' for subtraction");
            System.out.println("Press 'm''M''*' for multiplication");
            System.out.println("Press 'd''D''/' for division");
            
            System.out.println("Enter no1:");
            no1=input.nextInt();
            System.out.println("Enter no1: ");
            no2 = input.nextInt();
            System.out.println("Enter choice: ");
            ch1 = input.next().charAt(0);
            
            case 'd':
            case 'D':
            case '/':
            ans = no1/no2;
            System.out.println(no1+"/"+no2+"="+ans);
            default:
                 System.out.println("Invalid Value");   
        }
    }
}
