package Examples;
public class Week4Exp {
    public static void main(String[] args) {
        // for capital letters
        for(int i = 65; i<=90; i++){
            System.out.println((char)i);
        }
            //System.out.println((char)i); /*prints alphabets in another line
            // for small letter alphabets
            for (int i=97;i<=123;i++){
                System.out.print((char)i);   
            }
            int no=25;
            long fact = 1;
            for(int i=1; i<=no; i++){
                fact=fact*i;{
                System.out.println(fact);
            } }
                //dont write semicolon with for loop print 11
            int k;
            for(k=1;k<=10;k++);
            System.out.println(k);
            
            // 2 diff ways of writing for loop     
               //printing 2 table with for loop 
            int no1 =2,ans;
            for(int m=1;m<=10;m++){
                ans=no1*m;
                System.out.println(no1+"x"+m+"="+ans);}
            
            // printing 3 table
            int nos=3,ans1;
            int z =1;
            for(;z<=10;){
                ans1=nos*z;
                System.out.println(nos+"x"+z+"="+ans1);
                z++;}
        }
    }

