package Shapes2D;

public class MainShapes2D {
    public static void main(String[] args) {

        //Created objects
        Shape triangle1 = new Triangle(6.5, 8.1);

        //Output info about the shapes
        System.out.println("\n*******************************************************\n");
        System.out.println("Triangle triangle1:");
        triangle1.printVar();
        System.out.println(triangle1.countSquare());
        System.out.println(triangle1.countPerimeter());
        System.out.println("\n*******************************************************\n");


    }
}
