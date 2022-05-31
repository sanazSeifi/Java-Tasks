package Assignment4;

public class MainClass {
    public static void main(String[] args){
        CarClass ferrari = new CarClass(4,"Ferrari",4);
        System.out.println("I am ferrari");
        ferrari.setEngine("engine");
        ferrari.startEngine();
        ferrari.oilChange();
        CarClass jaguar = new CarClass("Jaguar",4,4,100);
        System.out.println("I am Jaguar");
        jaguar.setEngine("engine");
        jaguar.brake(3);
        CarClass linkoln = new CarClass();

    }
}

