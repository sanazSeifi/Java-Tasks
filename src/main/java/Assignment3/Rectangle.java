package Assignment3;

public class Rectangle extends ShapClass{
   double height;
  double width;
    int numSide;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

//    public Rectangle() {
//        super(numSide);
//    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }
}
