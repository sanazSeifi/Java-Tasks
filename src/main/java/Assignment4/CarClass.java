package Assignment4;

public class CarClass {
    public static String carName;
    public static int engine;
    public static int wheels;
    public static int doors;
    public  static int model;

    CarClass(int doors, String carName, int wheels){
       this.doors = doors;
       this.carName = "Car";
       this.model= 4;
       this.wheels = 4;
    }

    public CarClass() {
        wheels =4;
        carName = "Car";
        doors = 4;
        engine = 4;
        
    }

    public CarClass(String carName, int doors, int model, int engine) {
        this.carName = carName;
        this.doors = doors;
        this.model = model;
        this.engine = engine;
    }

    public static String getCarName() {
        return carName;
    }

    public static int getEngin() {
        return engine;
    }

    public static void setCarName(String carName) {
        CarClass.carName = carName;
    }

    public static void setEngin(char engin) {
        CarClass.engine = engin;
    }

    public static void setWheels(int wheels) {
        CarClass.wheels = wheels;
    }

    public static void setDoors(int doors) {
        CarClass.doors = doors;
    }

    public static int getWheels() {
        return wheels;
    }

    public static int getDoors() {
        return doors;
    }

    public void startEngine() {
        System.out.println("Engine Started");
    } public void accelerate () {
        System.out.println("Accelerate car");
    } public void brake () {
        System.out.println("Safe brake");
    } public void oilChange () {
        System.out.println("Change oil");
    }

    public int setEngine(String engine) {
        return this.engine;
    }

    public void setEngine() {
    }

    protected String getName() {
        return  this.carName;
    }

    public void brake(int i) {
    }
}



//a: when we extend the child object to CarClass it makes child object inheritance CarClass
//b:

