/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HinhHoc;

/**
 *
 * @author nhu quynh
 */
public class main {
   public static void main(String[] args) {
        HinhTru ht =new HinhTru();
        ht.nhapchieuCao();
        ht.nhapBK();
       
        System.out.println(ht.getTheTich());
        hinhChuNhat hcn = new hinhChuNhat();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        System.out.println("dien tich hinh chu nhat la" +hcn.getDienTich());
        System.out.println("chu vi hinh chu nhat la" +hcn.getChuVi());
        HinhTron htr = new HinhTron();
        htr.nhapBK();
        System.out.println("dien tich hinh tron la" +htr.getDienTich());
        
    } 
   
}
