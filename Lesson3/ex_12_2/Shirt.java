package ex_12_2;

public class Shirt extends  Item{
    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }

    // Override display() in the superclass to also show size and colorCode.
    @Override
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    }

    //   Avoid duplicating code.
}
