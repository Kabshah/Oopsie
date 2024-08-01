package Examples;

import java.util.Scanner;

public class parameters {
    public static void main(String[] args) { 
        sum(1,4);
        sum1(1,3,5);
        sum3(2,5,2,3,4);
        int src[] = {1,3,5,7,9};
        PrintArray(src);
        
        Scanner input = new Scanner(System.in);
        double no[] = new double[10];
        double sum = 0, avg;
        for (int t = 0; t < no.length; t++){
            System.out.print("Enter temperature of day "+(t+1)+":");
            no[t]=input.nextDouble();
        sum = sum + no[t];
        }
        System.out.println("sum="+sum);
        avg = sum/no.length;
        System.out.println("Average: "+avg);
        
    }//copying arr int int no and printing array with for each loop
    public static void PrintArray(int no[]){
        for (int i:no){
            System.out.println("Function: "+i);
        }
    }
    //when we have 2 parameters
    public static void sum(int no1,int no2){
        int ans = no1 + no2;
        System.out.println("Sum = "+ ans);
    }
    //when we have 3 parameters
    public static void sum1(int no1, int no2, int no3)
    {
        int ans1 = no1+no2+no3;
        System.out.println("Sum= "+ans1);
    }
    // when we have a lot of parameters of a function
    public static void sum3(int...no){
        int sum3 = 0;
        for(int i:no){
            sum3 = sum3 + i;
        }
        System.out.println("Sum= "+sum3);
    }
}