package Examples;
import java.util.Scanner;
public class sentinalLoop{
        public static void main(String[] args) {
        char ch = 'y';
        int no, ans;
        Scanner input = new Scanner(System.in);
        while( ch == 'y' || ch == 'Y'){
        System.out.print("Enter a no:");
        no = input.nextInt();
        for (int i=1; i<=10; i++){
            ans = no * i;
            System.out.println(no+"x"+i+"="+ans);}
        
        System.out.println("press y to continue");
        ch = input.next().charAt(0);
        }
        System.out.println("Out of loop");
        
        //2nd Prog Marksheet
        Scanner input1 = new Scanner(System.in);
        int j,no1,ans1, str, end, sz;
        System.out.print("Enter a no:");
        no1=input1.nextInt();
        System.out.print("Enter a starting no:");
        str = input1.nextInt();
        System.out.print("Enter an ending no:");
        end = input1.nextInt();
        System.out.print("Enter a step size:");
        sz = input1.nextInt();
        j=str;
        while(j<=end){
            ans1 = no1*j;
            System.out.println(no1+"x"+j+"="+ans1);
            j=j+sz;
        }
        System.out.println("idk");
    }
}