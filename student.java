/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author nhu quynh
 */
public class student {
public String stID;
public String stName;
public String stClass;

public student(String stID, String stName, String stClass){
  this.stID = stID;
  this.stName = stName;
   this.stClass = stClass;
}
public void setStID(String stID){
    this.stID = stID;
}
public void setStName(String stName){
    this.stName = stName;
}
public void setStClass(String stClass){
    this.stClass = stClass;
}
public String getStName(){
    return stName;
}
public String getStID(){
    return stID;
}
public String getStClass(){
    return stClass;
}
public String toString(){
    return stID +""+ stName +""+ stClass;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     student s1 = new student("sv01","Quynh","CNTT2");
     System.out.print(s1)   ;
    }
}
