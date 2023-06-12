package Shapes2D;

public class MainShapes2D {
    public static void main(String[] args) {

        //Created objects
        Shape triangle1 = new Triangle(6.5, 8.1);
        Triangle rectangle1 = new Rectangle(9.12, 12.3);
        Rectangle circle1 = new Circle(1, 5);     //????????????????????Why variable heigth = 1` doesn't influence on calculation

        //Output info about the shapes
        System.out.println("\n*******************************************************\n");
        System.out.println("Triangle triangle1:");
        triangle1.printVar();
        System.out.println(triangle1.countSquare());
        System.out.println(triangle1.countPerimeter());
        System.out.println("\n*******************************************************\n");

        System.out.println("Rectangle rectangle1:");
        rectangle1.printVar();
        System.out.println(rectangle1.countSquare());
        System.out.println(rectangle1.countPerimeter());
        System.out.println("\n*******************************************************\n");

        System.out.println("Circle circle1:");
        rectangle1.printVar();
        System.out.println(circle1.countSquare());
        System.out.println(circle1.countPerimeter());
        System.out.println("\n*******************************************************\n");


    }
}
