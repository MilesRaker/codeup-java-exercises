package shapes;

public class Square extends Rectangle{
    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getArea() {
        return 4 * super.getLength();
    }

    @Override
    public double getPerimeter() {
        return super.getLength() * super.getLength();
    }
}
