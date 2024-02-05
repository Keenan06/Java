package Lesson12;

public abstract class Clothing {
    private int itemID = 0;
    private String desc = "Description required";
    private char colorCode = 'U';
    private double price = 0.0;

    public Clothing(int itemID, String desc, char colorCode,
                    double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colorCode = colorCode;
        this.price = price;
    }

    public Clothing(double price) {
        this.price = price;
    }

//    public void display(){
//        System.out.println("Item ID: " + getItemID());
//        System.out.println("Item Description: " + getDesc());
//        System.out.println("Item Price: " + getPrice());
//        System.out.println("Color Code: " + getColorCode());
//    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColorCode() {
        return colorCode;
    }

    protected void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

//    public double getPrice() {
//        return price;
//    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected abstract double getPrice();

    public abstract void display();
    }

