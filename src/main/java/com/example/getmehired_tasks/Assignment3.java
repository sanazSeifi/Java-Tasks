package com.example.getmehired_tasks;

  public class Assignment3 {
     double hight;
     double width;
     double area;
     double primeter;

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
