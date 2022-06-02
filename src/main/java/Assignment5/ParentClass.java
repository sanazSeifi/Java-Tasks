package Assignment5;

public class ParentClass {
    public String name;
    public int age;

    public void display(){
        System.out.println("This is Parent Class Method");
    }
    public ParentClass(){
        name = "Unknown name";
        age = 0;
    }

    public ParentClass(String name, int age){
        this.name = name;
        this.age = age;
    }
}

