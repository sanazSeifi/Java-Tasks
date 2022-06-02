package Assignment4;

public class Linkoln extends CarClass{
    public String wheels;
    public int model;

    public Linkoln(){
        System.out.println("I am A beautiful Linkoln!");
    }
    public Linkoln(String carName, int doors, int model,int engine){
        super(carName,doors,model,engine);
        this.wheels = wheels;
    }

    public Linkoln(CarClass linkoln, int doors, int model, int engine) {
    }

    public  void brake(){
        System.out.println(" Brake the Car");
    }
    public void accelerate(int speed){
        System.out.println(super.getName() + " " + this.model +  "Accelerating to " + speed + "horsepower");
    }

    public void setModel(int model){
        this.model =model;
    }
    public int getModel(){
        return this.model;
    }
}
