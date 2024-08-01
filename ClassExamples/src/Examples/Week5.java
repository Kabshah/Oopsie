package Examples;
import java.util.Scanner;
public class Week5 {
    public static void main(String[] args) { 
        //nested loops & format specifiers
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
               System.out.print("*");
            }System.out.println("");
        }
        System.out.println("Printing downwards");
        int k,z;
        for (k=5; k>=1; k--){
            for (z=1; z<=k; z++){
                System.out.print("*");
            }System.out.println("");
       }
       int alpha,beta;
       for(alpha=65; alpha <=70; alpha+=1){
           for(beta = 65; beta<=alpha; beta++){
               System.out.print(""+(char)alpha);
           }System.out.println("");
       }//format specifier starts from 1 instead of 0
        System.out.printf("%.5s","Hello World");
        
        Scanner input = new Scanner(System.in);
        double no[] = new double[10];
        double sum = 0, avg;
        for (int t = 0; t < no.length; t++){
            System.out.print("Enter temperature of day "+(t+1)+":");
            no[t]=input.nextDouble();
        System.out.println("no["+t+"]="+no[t]);
        //sum and average of this same program is in parameters in main method
        String str1 = "Programming";
            System.out.println(str1.concat("Java"));
        }
    }}