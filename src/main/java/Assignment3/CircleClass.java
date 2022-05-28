package Assignment3;

public class CircleClass extends ShapClass{
    double circleRadian;
    public CircleClass(double circleRadian) {
        super(0);
        this.circleRadian = circleRadian;
    }

    @Override
    public double getArea() {
        return circleRadian * circleRadian * 3.14;
    }

    @Override
    public double getPerimeter() {
        return circleRadian * 3.14;
    }
}
