package shapes;

public class Square extends Quadrilateral{
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

    @Override
    void setLength(double length) {
        super.length = length;
        super.width = length;
    }

    @Override
    void setWidth(double width) {
        super.length = width;
        super.width = width;
    }
}
