package Shapes2D;

public class Triangle extends Shape {
    private double square;
    private double perimeter;
    protected double height;            //Why do I receive mistake, when I give PRIVATE modifier??????????????????
    protected double width;
    protected String name;


    public Triangle(String name, double height, double width) {
        this.height = height;
        this.width = width;
        this.name = name;
        this.square = square;
        this.perimeter = perimeter;
    }


    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


    //Overrided methods
    @Override
    public double getSquare() {
        square = 0.5 * height * width;
        return square;
    }


    //Method for calculation of perimeter of isosceles triangle
    @Override
    public double getPerimeter() {
        perimeter = width + 2 * Math.sqrt(0.25 * width * width + height * height);
        return perimeter;
    }

    @Override
    public String printShapeInfo() {

        String str = "Name of shape is: " + name + "\n" +
                "Height of triangle is: " + height + " sm" + "\n" +
                "Width of triangle is: " + width + " sm" + "\n" +
                "Perimeter of triangle is: " + getPerimeter() + " cm\n" +
                "Square  of triangle is: " + getSquare() + " cm2";
        return str;
    }
}


