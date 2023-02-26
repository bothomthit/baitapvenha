/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
/**
 *
 * @author nhu quynh
 */
public class nhanVien {
    public String tenNhanVien;
    public double luongCoBan;
    public double heSoLuong;
    public double LUONG_MAX;
    public nhanVien(){
        tenNhanVien = null;
        luongCoBan = 0;
        heSoLuong = 0;
        LUONG_MAX = 0;
    }
    
        public nhanVien(String tenNhanVien, double luongCoBan, double heSoLuong,  double LUONG_MAX ){
          this.tenNhanVien = tenNhanVien;
          this.luongCoBan = luongCoBan;
          this.heSoLuong = heSoLuong;
          this.LUONG_MAX = LUONG_MAX;
        }
    
        
    public String getTenNhanVien() {
        return tenNhanVien;
    }
        public void setTenNhanVien(String tenNhanVien){
            this.tenNhanVien = tenNhanVien;
        }        
         public double getLuongCoBan(){
             return luongCoBan;
         }       
         public void setLuongCoBan(double luongCoBan)   {
             this.luongCoBan = luongCoBan;
         }    
            public double getHeSoLuong(){
             return heSoLuong;
         }       
         public void setHeSoLuong(double heSoLuong)   {
             this.heSoLuong = heSoLuong;    
                
         }   
         public double getLUONG_MAX(){
             return LUONG_MAX;
         }       
         public void setLUONG_MAX(double LUONG_MAX)   {
             this.LUONG_MAX = LUONG_MAX;
    }
         public void inTTin(){
          System.out.println("Ten nhan vien la:"+ tenNhanVien) ;
          System.out.println("Luong co ban la:"+ luongCoBan);
          System.out.println("He so luong la:"+ heSoLuong);
          System.out.println("Luong toi da cho phep la:"+ LUONG_MAX);
         }
         public boolean tangLuong(double n){
           if(((heSoLuong+n)*luongCoBan)>LUONG_MAX){
             System.out.println("Luong khong duoc lon hon luong toi da. Nhap lai he so luong");
             return false;
           }
           else {
               return true;
           }  
         }
         public double tongLuong(){
             return luongCoBan*heSoLuong;
         }
                
}

