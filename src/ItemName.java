import java.util.ArrayList;

public class ItemName {

    private String name;

    private float price;

    public String unicode;
    public ItemName(){

    }

    public ItemName(String name, float price, String unicode) {
        this.name = name;
        this.price = price;
        this.unicode = unicode;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(float price){
        this.price=price;
    }

    public String getName(){
        return this.name;
    }

    public float getPrice(){
        return this.price;
    }


}
