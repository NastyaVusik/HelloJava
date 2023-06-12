package Shapes2D;

public class Rectangle extends Triangle {
    private double square;
    private double perimeter;

    public Rectangle(double height, double width) {
        super(height, width);                //Constructor from super class Shape
        this.square = square;
        this.perimeter = perimeter;
    }

    public String countSquare() {
        square = height * width;
        return "Square of the rectangle is " + String.format("%.2f", square) + " sm2";
    }

    public String countPerimeter() {
        perimeter = 2 * (width + height);
        return "Perimeter of the rectangle is " + String.format("%.2f", perimeter) + " sm";

    }
}

