/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhHoc;

/**
 *
 * @author nhu quynh
 */
public class HinhHoc {
    
    
    
    public HinhHoc(){
        
    }
    public HinhHoc(float theTich, float dienTich, float chuVi, String ten) {
        this.theTich = theTich;
        this.dienTich = dienTich;
        this.chuVi = chuVi;
        this.ten = ten;
       
    }
    public float PI = (float) 3.14;

    public float getPI() {
        return PI;
    }
    public float theTich;

    public float getTheTich() {
        return theTich;
    }

    public void setTheTich(float theTich) {
        this.theTich = theTich;
    }

    public float dienTich;

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public float chuVi;

    public float getChuVi() {
        return chuVi;
    }

    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

    public String ten;

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
  
    System.out.print(ten);
   
    
}
public void inChuVi(){
     System.out.print(chuVi);
    
}
public void indienTich(){
     System.out.print(dienTich);
     
}
public void intheTich(){
     System.out.print(theTich);
     
}
}
