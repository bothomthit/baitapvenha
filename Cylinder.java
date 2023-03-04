/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cricle;

/**
 *
 * @author nhu quynh
 */
public class Cylinder extends Cricle {
  
    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
  
    public double volume;

    public double getVolume() {
        return getArea()*height;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Cylinder() {
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
    }

}
