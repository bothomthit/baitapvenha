/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author nhu quynh
 */
public class hinhVuong {
    int canh;
   String mausac; 
   public hinhVuong(){
       canh = 0;
       mausac = null;
   }
     
         public int getCanh()
    {
      return canh;
    }
   public String getMausac(){
       return mausac;
   }
  public void setCanh(int canh){
      this.canh = canh;
  }
public void setMausac(String mausac){
    this.mausac = mausac;
}  
    public hinhVuong(int canh , String mausac){
    this.canh = canh;
    this.mausac = mausac;
}
}
