package sda.inherit.exerc01;

public class Exerc01 {

    public static void main(String[] args) {
        Shapes rectangle001 = new Rectangle(3, 1);
        Shapes circle001 = new Circle(2);

        Shapes shapes[] = new Shapes[2];
        shapes[0] = rectangle001;
        shapes[1] = circle001;

        for (Shapes shape :
                shapes) {
            System.out.println(shape.getPerimeter());
            System.out.println(shape.getArea());
            System.out.println();
        }

    }
}
