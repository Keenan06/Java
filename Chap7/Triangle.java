package Chap7;
// subclass of TwoDShape
class Triangle extends TwoDShape {
     private String style;

    Triangle() {
        super();
        style = "none";
    }

    // Constructor
    Triangle(String s, double w, double h) {
        super(w, h);

        style = s;
    }

    Triangle(double x) {
        super(x, "triangle");

        style = "filled";
    }
    Triangle(Triangle ob) {
        super(ob); // pass object to TwoDShape constructor
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }

}

