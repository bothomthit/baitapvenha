/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhHoc;
import java.util.Scanner;
/**
 *
 * @author nhu quynh
 */
public class HinhHoc {
  public float PI = (float) 3.14 ;   
   public float theTich;  
   public float dienTich;
    public String ten;
    public float chuVi;
    Scanner sc= new Scanner(System.in);
 public HinhHoc() {
           
    }
    

    public float getPI() {
        return PI;
    }
   

    public float getTheTich() {
        return theTich;
    }

    public void setTheTich(float theTich) {
        this.theTich = theTich;
    }

    

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    

    public float getChuVi() {
        return chuVi;
    }

    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

   

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setPI(float PI) {
        this.PI = PI;
    }
public void Xuatten(){
  
    System.out.print("nhap ten");
    ten = sc.next(ten);
    System.out.println("ten da nhap la" +this.ten);
   
    
}
public void inChuVi(){
     System.out.print("nhap chu vi");
     chuVi = sc.nextFloat();
     System.out.println("Chu vi la" + this.chuVi);
    
}
public void indienTich(){
     System.out.println("nhap dien tich");
    dienTich = sc.nextFloat();
    System.out.print("dien tich la"+this.dienTich);
     
}
public void intheTich(){
    System.out.println("nhap vao the tich"); 
    theTich = sc.nextFloat();
    System.out.print("the tich la" +this.theTich);
}}
      
 
    
   

