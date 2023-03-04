/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhHoc;

/**
 *
 * @author nhu quynh
 */
public class HinhTron extends HinhHoc{
 
    public float banKinh;

    public float getBanKinh() {
        return banKinh;
    }

   
    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    public float chuVi;

    @Override
    public float getChuVi() {
        return 2*banKinh*PI;
    }

    @Override
    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }
   
    public float dienTich;

    @Override
    public float getDienTich() {
        return banKinh*banKinh*PI;
    }

    @Override
    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

}
