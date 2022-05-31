package Assignment4;

public class Jaguar extends CarClass {
    public int model;
    public int cylinder;

    public Jaguar(){
        super();
        System.out.println(" Jaguar is a car with " + cylinder + "Cylinders and ");
    }

    public Jaguar(String carName, int cylinder, int wheels, int model){
        super(carName,cylinder,wheels,model);
        this.model = model;
        this.wheels =wheels;
    }

    public void setModel(int model){
        this.model = model;
    }
    public int getModel(){
        return this.model;
    }
    public void setCylinder(int cylinder){
        this.cylinder = cylinder;
    }
    public int getCylinder(){
        return this.cylinder;
    }
}
