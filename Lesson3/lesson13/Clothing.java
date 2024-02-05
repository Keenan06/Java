package lesson13;

public abstract class Clothing {
    private char fit = 'U';
    private int itemId;
    private String desc;
    private double price;
    private char colorCode;

    public Clothing() {

    }

    public Clothing(int itemId, String desc, double price, char colorCode) {
        this.itemId = itemId;
        this.price = price;
        this.colorCode = colorCode;
        this.desc = desc;
    }

    public abstract void display();

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double getPrice();

    public void setPrice(double price) {
        this.price = price;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
}

