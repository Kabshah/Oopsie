
public class ElectricBlanket extends Blanket{
    double no_of_heating_setting;
    String shutof_feature;
    double ele_price;
    ElectricBlanket(){
        super();
        this.no_of_heating_setting = 1;
        this.shutof_feature = "no";
    }
    void setno_of_heating_setting(int no_of_heating_setting){
        if( no_of_heating_setting < 1 || no_of_heating_setting >5 ){
            this.no_of_heating_setting = 1;} 
        else{
            this.no_of_heating_setting = no_of_heating_setting;}
    }
    void setele_price(){
        this.ele_price = super.price;
    }
    double getset_price(){
        return this.ele_price;
    }
    double getno_of_heating_settin(){
        return this.no_of_heating_setting = no_of_heating_setting;}
    void setshutOffFeature(String shutof_Feature){
        this.shutof_feature = shutof_Feature;
        if (shutof_feature == "yes"){
            this.ele_price=5.75+30;}  
    }
    String getsetshutOffFeature(){
        return shutof_feature;}
    public String toStrin(){
        System.out.println( "Electric blanket price is:" +ele_price);
        return (super.toStrin());}
     public static void main(String[] args) {
        Blanket defaultblanket = new Blanket();        
        System.out.println("Default blanket:"+defaultblanket.toStrin());
        ElectricBlanket defaultelectric = new ElectricBlanket();
        System.out.println("Default blanket:"+defaultelectric.toStrin());
    }
}