package lesson13;

public class Shirt extends Clothing implements Returnable{
    private char fit = 'U';
    private int itemId;
    private String desc;
    private double price;

    public Shirt(int itemId, String desc, double price,char colorCode,char fit){
        super(itemId, desc, price, colorCode);

        this.itemId = itemId;
        this.fit = fit;
        this.desc = desc;
        this.price = price;


    }

    @Override
    public void display(){
        System.out.println("Fit is "+ fit);
    }


//    @Override


    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }


    public double getPrice() {
        return 0;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString(){
        return "\nItem id is :" +itemId + "\nDescription is: " + desc + "\nPrice is "+ price;


    }
    public String doReturn(){
        return " Suit returns must be within 3 days";
    }

}
