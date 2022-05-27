package com.example.getmehired_tasks;

  public class Assignment3 {
    private double hight;
    private double width;
   private double area;
   private double primeter;

    // Hight
     public void setHeight(double ht){
         if (ht>hight)
             ht = hight;
         else System.out.println("Invalid hight: " + ht);
     }
     public double getHeight(){
         return hight;
     }


     //width
     public void  setWidth(double wt){
         if(wt>width)
             wt = width;
         else System.out.println("Invalid Width: " + wt);
     }
     public double getWidth(){
         return width;
     }

     //area
     public void setArea(double ar){
        ar = area;
     }
     public  double getArea(){
         return area;
     }


}
