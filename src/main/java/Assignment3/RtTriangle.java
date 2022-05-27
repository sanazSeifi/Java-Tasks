package Assignment3;

public class RtTriangle extends ShapClass{

    double height;
    double width;

    public RtTriangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return 3 * width;
    }
}
