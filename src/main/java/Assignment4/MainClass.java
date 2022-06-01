package Assignment4;

public class MainClass {
    public static void main(String[] args){
        CarClass ferrari = new Ferrari();
        CarClass Ferrari2 = new Ferrari(4,ferrari,4, 5);
        System.out.println("I am ferrari");
        ferrari.setEngine("engine");
        ferrari.startEngine();
        ferrari.oilChange();
        Ferrari ferrari3 = new Ferrari();
        System.out.println(ferrari3.getName());
        Ferrari2.brake();

        CarClass jaguar = new Jaguar();
        jaguar.brake();
        Jaguar jaguar1 = new Jaguar();
        jaguar1.accelerate();

        CarClass linkoln = new Linkoln();
        linkoln.brake();
        linkoln.oilChange();
        Linkoln linkoln1 = new Linkoln(linkoln,4,45,3);
        linkoln1.accelerate(200);
        System.out.println(linkoln1.getName());






    }

}

