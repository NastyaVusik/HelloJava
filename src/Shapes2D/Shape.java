package Shapes2D;

public abstract class Shape {
    public double height;
    public double width;


    //Constructor
    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    //abstract classes
    abstract String countSquare();

    abstract String countPerimeter();


    //Methods of access to variables weight and height
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method for output variables in console
    public void printVar() {
        System.out.println("Height is: " + height + "sm" + "\n" +
                "Width is: " + width + "sm");
    }
}
