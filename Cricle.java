/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cricle;

/**
 *
 * @author nhu quynh
 */
public class Cricle {
public String color;
public double radius;
    public Cricle() {
    }
public Cricle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }
    

    public double getRadirus() {
        return radius;
    }
    public double area;

    public double getArea() {
        return area = radius*radius*3.14;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public void setRadirus(double radirus) {
        this.radius = radirus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }   
@Override
    public String toString (){
        return "Ta co hinh tron mau"+color+" va dien tich la: "+getArea();
}
}
