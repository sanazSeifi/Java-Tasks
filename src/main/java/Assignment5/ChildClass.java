package Assignment5;

public class ChildClass extends ParentClass{
    private int childId;

    public void display(){
        super.display();
        System.out.println("This is Child Class Method");
    }
    public ChildClass(){
        super();
        childId = 0;
    }

    public ChildClass(String name, int age, int ChildId){
        super(name, ChildId);
        this.childId = ChildId;
    }
}
