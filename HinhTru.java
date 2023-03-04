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
 
    public float chieuCao;

    public HinhTru(float banKinh) {
        super(banKinh);
    }

    /**
     * Get the value of chieuCao
     *
     * @return the value of chieuCao
     */
    public float getChieuCao() {
        return chieuCao;
    }

    /**
     * Set the value of chieuCao
     *
     * @param chieuCao new value of chieuCao
     */
    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }
   
    public float theTich;

    /**
     * Get the value of theTich
     *
     * @return the value of theTich
     */
    @Override
    public float getTheTich() {
        return PI*banKinh*banKinh*chieuCao;
    }

    /**
     * Set the value of theTich
     *
     * @param theTich new value of theTich
     */
    @Override
    public void setTheTich(float theTich) {
        this.theTich = theTich;
    }

}
