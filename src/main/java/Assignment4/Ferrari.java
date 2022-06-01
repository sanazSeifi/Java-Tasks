package Assignment4;

public class Ferrari extends CarClass {
    public int doors;
    public int wheels;
    public int engine;

    public Ferrari(){
        super();
        System.out.println("This Car contain " + super.getDoors() + " Doors and " + super.getWheels() + " Wheels." );
    }

    public Ferrari( int doors, String carName, int wheels,String engine){
        super( doors,carName, wheels,engine);
        this.doors =doors;
        this.carName = carName;
        this.wheels = wheels;
    }

    public Ferrari(int doors, CarClass ferrari, int wheels, int i) {
    }
}
