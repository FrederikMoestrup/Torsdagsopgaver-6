package Task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(1);
        Square s1 = new Square(1.5);

        System.out.println(c1.getArea());
        System.out.println(s1.getArea());

        ShapeBuilder build1 = new ShapeBuilder();
        ShapeBuilder build2 = new ShapeBuilder();


        build1.addShape(c1);
        build1.addShape(s1);
        build2.addShape(s1);

        System.out.println(build1.getTotalArea());
        System.out.println(build2.getTotalArea());

    }
}