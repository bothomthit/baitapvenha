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
public class hinhChuNhat extends HinhHoc {
  
    public float dai;

    /**
     * Get the value of dai
     *
     * @return the value of dai
     */
    public float getDai() {
        return dai;
    }

    /**
     * Set the value of dai
     *
     * @param dai new value of dai
     */
    public void setDai(float dai) {
        this.dai = dai;
    }

    public float rong;

    /**
     * Get the value of rong
     *
     * @return the value of rong
     */
    public float getRong() {
        return rong;
    }

    /**
     * Set the value of rong
     *
     * @param rong new value of rong
     */
    public void setRong(float rong) {
        this.rong = rong;
    }

    public hinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

     public float chuVi;

    /**
     * Get the value of chuVi
     *
     * @return the value of chuVi
     */
    @Override
    public float getChuVi() {
        return (dai+rong)*2;
    }

    /**
     * Set the value of chuVi
     *
     * @param chuVi new value of chuVi
     */
    @Override
    public void setChuVi(float chuVi) {
        this.chuVi = chuVi;
    }

      public float dienTich;

    /**
     * Get the value of dienTich
     *
     * @return the value of dienTich
     */
    @Override
    public float getDienTich() {
        return dai*rong;
    }

    /**
     * Set the value of dienTich
     *
     * @param dienTich new value of dienTich
     */
    @Override
    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
 public void nhapChieuDai(){
        System.out.println("Nhap chieu dai");
        dai=scanner.nextFloat();
    }
} 
