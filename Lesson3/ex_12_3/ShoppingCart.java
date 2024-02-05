package ex_12_3;

public class ShoppingCart {
    public static void main(String[] args) {
         Item myShirt = new Shirt(200.99,'R','B');
        myShirt.display();

        if (myShirt instanceof Shirt){
            String color = ((Shirt)myShirt).getColor();
        }else{
            System.out.println(" shirt1 does not contain a shirt");
        }
    }
}
