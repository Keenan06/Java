/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author keenanpienaar
 */
public class Shirt {

    private int shirtID = 0;
    private String description = "-description required-";
    private char colorCode = 'U';
    private double price = 0.0;

    public Shirt() {
        setColorCode('U');
    }

    public Shirt(char colorCode) {
        this();
        setColorCode(colorCode);
    }

    public Shirt(char colorCode, double price) {
        this(colorCode);
        setPrice(price);
    }

    public Shirt(char colorCode, String desc, double price) {

        this(colorCode, price);
        setDescription(desc);

    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {

        if (colorCode == 'R') {
            this.colorCode = colorCode;
            return;
        }

        if (colorCode == 'G') {
            this.colorCode = colorCode;
            return;
        }

        if (colorCode == 'B') {
            this.colorCode = colorCode;
            return;
        }

        System.out.println("Invalid. Choose between R G B");
    }

    /**
     * @return the shirtID
     */
    public int getShirtID() {
        return shirtID;
    }

    /**
     * @param shirtID the shirtID to set
     */
    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
