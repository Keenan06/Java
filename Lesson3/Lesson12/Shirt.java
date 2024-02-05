package Lesson12;

public class Shirt extends Clothing{
    private int neckSize;
    private char fit = 'U';

    public Shirt(char fit){
        this(15.00, fit);
    }

    public Shirt(double price, char fit){
        super(price);
        this.fit = fit;
    }
    public Shirt(int itemID, String desc, char colorCode, double price) {
        super(itemID, desc, colorCode, price);
        this.fit = fit;
    }

    public void display(){
        System.out.println("Item ID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Item Price: " + getPrice());
        System.out.println("Color Code: " + getColorCode());
    }

    protected void setColorCode(char colorCode){
        switch(colorCode){
            case 'R', 'G', 'B': super.setColorCode(colorCode);
            break;
            default:
                System.out.println("Invalid value");
        }
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public int getNeckSize() {
        return neckSize;
    }

    public void setNeckSize(int nSize){
        this.neckSize = nSize;
    }
}
