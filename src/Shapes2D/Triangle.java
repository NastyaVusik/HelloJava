package Shapes2D;

public class Triangle extends Shape {
    private double square;
    private double perimeter;


    public Triangle(double height, double width) {
        super(height, width);                      //Constructor from super class Shape
        this.square = square;
        this.perimeter = perimeter;
    }


    //Overrided methods
    @Override
    public String countSquare() {
        square = 0.5 * height * width;
        return "Square of the triangle is " + String.format("%.2f", square) + " sm2";
    }

    @Override
    public String countPerimeter() {
        perimeter = 0.5 * width + Math.sqrt(0.25 * width * width + height * height);
        return "Perimeter of the triangle is " + String.format("%.2f", perimeter) + " sm";
    }
}
