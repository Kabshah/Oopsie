public class Blanket {
    double price;
    String color, material,size;
    Blanket(){
        this.color = "white";
        this.size = "Twin";
        this.price = 30;
        this.material = "cotton";}
    void setcolor(String color){
        this.color = color;}
    void setsize(String size){
        this.size = size;
        switch (size){
            case "Double":
                this.price = 30+10;
                break;
            case "queen":
                this.price = 30+25;
                break;
            case "king":
                this.price = 30+40;
                break;
            default:
                this.price=30;}
    }
    void setmaterial(String material){
        this.material = material;
        switch(material){
            case "wool":
                this.price = 30+20;
                break;
            case "cashemere":
                this.price = 30+45;
                break;
            default:
                break;}
    }
    String toStrin(){
        return "color: "+color+" Material: "+material+" Price: $"+price+ " Blanket size: "+size;
    }
}
