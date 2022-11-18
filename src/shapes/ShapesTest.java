package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("box1.getArea() = " + box1.getArea());
        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());

        Quadrilateral box2 = new Square(5);
        System.out.println("box2.getArea() = " + box2.getArea());
        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());

        Measurable myShape = new Square(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = new Rectangle(5, 4);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        /*Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?*/
        /* getPerimeter is an abstract method of Quadrilateral, which means it must be implemented
        * in all classes extending Quadrilateral*/

        /*What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?*/
        // myShape.getWidth(); is not defined anywhere in Rectangle's ancestry, therefor does not compile
    }


}
