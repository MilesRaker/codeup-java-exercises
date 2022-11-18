package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    public double getLength() {
        return length;
    }

    protected double length;

    public double getWidth() {
        return width;
    }

    abstract void setLength(double length);

    abstract void setWidth(double width);

    protected double width;
    public Quadrilateral (double l, double w){
        this.length=l;
        this.width=w;
    }

}
