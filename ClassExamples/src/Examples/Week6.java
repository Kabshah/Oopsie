package Examples;
import java.util.Scanner;
public class Week6 {
    public static void main(String[] args) {//already initialized array
        int arr[] = {1,4,5,6,7,8};
        int sum = 0;
        System.out.println("Length= "+arr.length);
        for(int i : arr){
            sum = sum+i; /*array kee sari values i mai shift hogai h we 
            are printing i here we are adding with iaswll instead of arr*/
            System.out.println(""+i);}
        System.out.println("Sum = "+ sum);
        
        
        //taking input from the user to initialize/create an array
        Scanner input = new Scanner(System.in);
        int arr1[] = new int[5];
        int sum1 = 0;
        System.out.println("Length= "+arr1.length);
        for(int j = 0; j<arr1.length; j++){
            System.out.print("Enter value "+(j+1)+": ");
            arr1[j]=input.nextInt();}//for doing sum of those values and printing them
        for (int j:arr1){
            System.out.println(""+j);
            sum1 = sum1 + j;}
        System.out.println("Sum = "+sum1);
        
        
        int src[] = {1,3,5,7,9};
        int tgt[] = new int[src.length];
        System.arraycopy(src,0, tgt,0, src.length);
        for(int k:tgt){
            System.out.println(""+k);
        }
        //taking random nos to intialize in array & printing them
        int arr2[]= new int[6];
        int sum2 = 0;//for feneration random no and dispalying them
        System.out.println("Length: "+arr2.length);
        for(int k=0; k<arr2.length; k++){
            arr2[k] = 1 + (int)(Math.random()*100);
        }//for doing the sum and printing it.
        for(int k:arr2){
            System.out.println(""+k);
            sum2 = sum2+k;
        }
        System.out.println("Sum:"+sum2);
        
        //slides dry run 1st wala
        int [] values = new int[5];
        for(int i = 1; i<5; i++){
            values [i] = i+values[i-1];
            System.out.println(values[i]);
        }
        values[0] = values[1] + values[4];
        System.out.println(values[0]);
    }
    }