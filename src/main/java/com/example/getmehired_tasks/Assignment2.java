package com.example.getmehired_tasks;

class Assignment2 {
    private int stuID1;
    private  String stuName1;
    private  int stuAge1;

    //first way:
    public static void main(String[] args){
        String [] identification = {"stuID", "stuName", "stuAge"};
        for(int i=0; i<identification.length; i++){
            System.out.println("Student ID is " + identification[0]);
            System.out.println("Student Name is " + identification[1]);
            System.out.println("Student Age is " + identification[2]);


        }
    }

    //second way:
    static Assignment2 studentId = new Assignment2();
    public static void main1( String[] args){
        System.out.println("Student ID is : " + studentId.stuID1 );
        System.out.println("Student Name is : " + studentId.stuName1);
        System.out.println("Student Age is : " + studentId.stuAge1);
    }
}
