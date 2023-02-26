/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author nhu quynh
 */
public class vector {
    public vector(){
        x = 0;
        y = 0;
        z =0;
    }
    public int x, y, z ;
    public vector(int x, int y, int z){
      this.x = x;
      this.y = y;
      this.z = z;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
       return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z = z;
    }
    public vector add(vector a){
         x+=a.x;
        y+=a.y;
        z+=a.z;
        return new vector(x,y,z);
    }
    public vector sub(vector a){
        x-=a.x;
        y-=a.y;
        z-=a.z;
        return new vector(x,y,z);
    }
    public vector mul(float b){
        x*=b;
        y*=b;
        z*=b;
        return new vector(x,y,z);
    } 
    }

