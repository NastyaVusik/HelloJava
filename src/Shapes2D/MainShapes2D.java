package Shapes2D;

public class MainShapes2D {
    public static void main(String[] args) {

        //Created objects
        //Array of the shapes
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle("triangle1", 6.5, 8.1);
        shapes[1] = new Triangle("triangle2", 11, 9.4);
        shapes[2] = new Rectangle("rectangle1", 9.12, 12.3);
        shapes[3] = new Circle("circle1", 5);
        shapes[4] = new Circle("circle2", 3.6);


        //Output of calculation result of total square of all the shapes
        System.out.printf("Total square of all figures is " + String.format("%.2f", getFullSquare(shapes)) + " cm2\n");
        System.out.println("\n*******************************************************\n");

    }


    //Method for sum all squares of the shapes
    static double getFullSquare(Shape[] shapes) {
        double fullSquare = 0;

        for (Shape shape : shapes) {
            fullSquare += shape.getSquare();

            System.out.println(shape.printShapeInfo());
            System.out.println("\n*******************************************************\n");
        }
        return fullSquare;
    }


}


