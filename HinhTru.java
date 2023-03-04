/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhHoc;

/**
 *
 * @author nhu quynh
 */
public class HinhTru extends HinhTron {
    float chieuCao;

    public HinhTru() {
        
    }

   public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }
   
    public float theTich;

    @Override
    public float getTheTich() {
        return PI*banKinh*banKinh*chieuCao;
    }

    @Override
    public void setTheTich(float theTich) {
        this.theTich = theTich;
    }
public void nhapchieuCao(){
    System.out.println("nhap vao chieu cao");
    chieuCao = sc.nextFloat();
}
    }
    

