package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    protected double length;
    protected double width;

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width){
        super(length, width);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return this.length * 2 + this.width * 2;
    }
}
