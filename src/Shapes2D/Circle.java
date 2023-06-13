package Shapes2D;

public class Circle extends Rectangle {
    private double square;
    private double perimeter;
    private double radius;

    public Circle(String name, double radius) {
        super(name, 0, 0);                    //Constructor from super class Rectangle
        this.radius = radius;
        this.square = square;
        this.perimeter = perimeter;

    }


    @Override
    public String getName() {
        return super.getName();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getSquare() {
        square = Math.PI * radius * radius;
        return square;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String printShapeInfo() {
        String str = "Name of shape is: " + getName() + "\n" +              //Why do I use method getName() to receive name?????????????????
                "Radius of circle is: " + radius + " sm" + "\n" +
                "Perimeter of circle is: " + getPerimeter() + " sm\n" +
                "Square  of circle is: " + getSquare() + " cm2";

        return str;
    }
}