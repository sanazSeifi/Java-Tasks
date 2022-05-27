package Assignment3;

public class Rectangle extends ShapClass{
    double height;
    double width;

    public Rectangle(int numSide) {
        super(numSide);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }
}
