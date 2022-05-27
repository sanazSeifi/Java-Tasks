package Assignment3;

public abstract class ShapClass {
    double numSide;
   public ShapClass(int numSide){
       this.numSide = numSide;
   }
    public  double getNumSide(){
       return  numSide;
}
    public abstract double getArea();

    public abstract double getPerimeter();
}

