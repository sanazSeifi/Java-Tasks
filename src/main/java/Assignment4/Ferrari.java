package Assignment4;

public class Ferrari extends CarClass {
    public int doors;
    public int wheels;


    public Ferrari(){
        super();
        System.out.println("This Car contain " + super.getDoors() + " Doors."  );
    }
    public Ferrari(int doors, int wheels) {

        this.doors = doors;
        this.wheels = wheels;
    }



    public void startEngine(String name){
        System.out.println("The " + super.getName() + " is so beautiful.");
    }

}
