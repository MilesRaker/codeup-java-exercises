package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();
        boolean anotherCircle = true;
        anotherCircle = in.yesNo("Do you want to make another circle?");

        while(anotherCircle) {
            double radius = in.getDouble(0, Integer.MAX_VALUE, "Enter a radius: ");
            Circle circle = new Circle(radius);
            System.out.println("circle.getArea() = " + circle.getArea());
            System.out.println("circle.getCircumference() = " + circle.getCircumference());
            anotherCircle = in.yesNo("Do you want to make another circle?");
            System.out.println();
        }
    }
}
