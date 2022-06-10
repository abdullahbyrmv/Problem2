import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("r1", 3, 5);
        Rectangle r2 = new Rectangle("r2", 2, 7);
        Rectangle r3 = new Rectangle("my_rect", 5, 5);
        Sphere s1 = new Sphere("s1", 3);
        Sphere s2 = new Sphere("s2", 6);
        Sphere s3 = new Sphere("ball", 5);
        Shape[] shapes = new Shape[] { s2, r1, s1, r2, s3, r3 };
        System.out.println("***Printing all the shapes***");
        ShapeUtil.printShapes(shapes);
// TODO: uncomment the next two lines, test your sort method.
// PaintManager.sort(shapes);
// printShapes(shapes);
// Comment them out then.
        System.out.println("***Printing the shapes that could be painted\n\tgiven the #cans and value of each can***");
        //If you want to give input yourself, please uncomment lines 20-25 and comment line 26.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number of cans: ");
//        int nbCans = input.nextInt();
//        System.out.print("Enter the volume of one can: ");
//        double vol = input.nextDouble();
//        ShapeUtil.printShapes(PaintManager.getPaintedShapes(shapes, nbCans, vol));
        ShapeUtil.printShapes(PaintManager.getPaintedShapes(shapes, 3, 100));
        System.out.println("***Finding and printing the shapes based on the given name***");
        // if you want to search for specific name, please uncomment lines 29-32 and comment lines 33 and 34.
//        System.out.print("Enter the name you are looking for: ");
//        String name = input.next();
//        Shape res = ShapeUtil.findShapeByName(shapes, name);
//        System.out.println(name + ": " + res);
        Shape res = ShapeUtil.findShapeByName(shapes, "r1");
        System.out.println("r1: " + res);
        System.out.println("ball: " + ShapeUtil.findShapeByName(shapes, "ball"));
        System.out.println("rect: " + ShapeUtil.findShapeByName(shapes, "rect"));
    }
}
