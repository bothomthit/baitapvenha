/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author nhu quynh
 */
public class Triangle {
    float width ;
     float height ;
     public Triangle(float width , float height)
     {
     
     }
    public float getWidth(){
      return width;
    }
   public float getHeight(){
       return height;
   }
  public void setWidth(float width){
      this.width = width;
  }
public void setHeight(float height){
    this.height = height;
}   
    @Override
 public String toString(){
       return "chieu dai canh day :"+this.width + "chieu cao:"+this.height;
}}
