package Lesson12;

public class Socks extends Clothing{
    private double price;

    public Socks(int itemID, String desc, char colorCode, double price) {
        super(itemID, desc, colorCode, price);
    }

    public Socks(double price) {
        super(price);
    }

    protected double getPrice(){
        return price;
    }
    public void display(){
        System.out.println("ID " + getItemID());
        System.out.println("Price is: " + getPrice());
    }
}
