public class Acalc extends A implements Calculator,areas{
    Acalc(){
        super();
}
    Acalc(String type){
        super(type);
        super.toString();
    }
    public void add(int...no){
        int sum = 0;
        for(int n:no){
            sum +=n;}
        System.out.println("Sum="+sum);
    }
    public void sub(int no1,int no2){
        int ans;
        ans = no1-no2;
        System.out.println(no1+"-"+no2+"="+ans);
    }
    public void mul(int...no3){
        int multiply = 0;
        for(int nn:no3){
          multiply *= nn;  
        }
        System.out.println("multiply= "+multiply);
    }
    public void atriangle(double dim1,double dim2){
        System.out.println("Area of a triangle ="+dim1*dim2/2);
    }
    public void asquare(double dim1){
        System.out.println("Area of a square ="+dim1*dim1);
    }

}
