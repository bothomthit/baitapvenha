/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author nhu quynh
 */
public class hinhTron {
   int bankinh;
   String mausac; 
   public hinhTron(){
       bankinh = 0;
       mausac = null;
   }
     
         public int getBankinh()
    {
      return bankinh;
    }
   public String getMausac(){
       return mausac;
   }
  public void setBankinh(int bankinh){
      this.bankinh = bankinh;
  }
public void setMausac(String mausac){
    this.mausac = mausac;
}  
    public hinhTron(int bankinh , String mausac){
    this.bankinh = bankinh;
    this.mausac = mausac;
}
}
   

