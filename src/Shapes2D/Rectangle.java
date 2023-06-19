package Shapes2D;

public class Rectangle extends Triangle {
    private double square;
    private double perimeter;
    private String name;


    public Rectangle(String name, double height, double width) {
        super(name, height, width);                //Constructor from super class Triangle
        this.square = square;
        this.perimeter = perimeter;
    }


//    @Override
//    public double getHeight() {
//        return super.getHeight();
//    }
//
//    @Override
//    public double getWidth() {
//        return super.getWidth();
//    }
//
//
//    @Override
//    public String getName() {
//        return super.name;
//    }

    @Override
    public double getSquare() {
        square = height * width;
        return square;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (width + height);
        return perimeter;
    }

    @Override
    public String printShapeInfo() {
        String str = "Name of shape is: " + getName() + "\n" +                   //Why does variable name give null, but method getName() give name??????????????????????
                "Height of rectangle is: " + height + " sm" + "\n" +
                "Width of rectangle is: " + width + " sm" + "\n" +
                "Perimeter of triangle is: " + getPerimeter() + " sm\n" +
                "Square  of triangle is: " + getSquare() + " cm2";

        return str;
    }
}

