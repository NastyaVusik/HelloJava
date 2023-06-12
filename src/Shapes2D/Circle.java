package Shapes2D;

public class Circle extends Rectangle {
    private double square;
    private double perimeter;

    public Circle(double height, double width) {
        super(height, width);                //width is radius of circle
        this.square = square;
        this.perimeter = perimeter;
    }


    public String countSquare() {
        square = Math.PI * width * width;
        return "Square of the circle is " + String.format("%.2f", square) + " sm2";
    }

    public String countPerimeter() {
        perimeter = 2 * Math.PI * width;
        return "Length of circle is " + String.format("%.2f", perimeter) + " sm";
    }
}
