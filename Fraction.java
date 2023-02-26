/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author nhu quynh
 */
public class Fraction {
    private int numerator, denominator;
    public Fraction(){
        numerator = 0;
        denominator = 1;
    }
 
    
     public int getNumerator() {
        return numerator;
    }
 
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
 
    public int getDenominator() {
        return denominator;
    }
 
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    
}
    public Fraction(int numerator, int denominator) {
        super();
        this.numerator = numerator;
        this.denominator = denominator;
    }
     
    public void add(Fraction fr) {
        int num = this.getNumerator() * fr.getDenominator() + fr.getNumerator() * this.getDenominator();
        int den = this.getDenominator() * fr.getDenominator();
        Fraction Add = new Fraction(num, den);
   
        System.out.println("Tổng hai phân số = " + Add.numerator + "/" + Add.denominator);
    }
      
    public void sub(Fraction Fr) {
        int num = this.getNumerator() * Fr.getDenominator() - Fr.getNumerator() * this.getDenominator();
        int den = this.getDenominator() * Fr.getDenominator();
       Fraction Sub = new Fraction(num , den );
      
        System.out.println("Hiệu hai phân số = " + Sub.numerator + "/" + Sub.denominator);
    }
     
    public void mul(Fraction ps) {
        int num = this.getNumerator() * ps.getNumerator();
        int den = this.getDenominator() * ps.getDenominator();
        Fraction Mul = new Fraction(num, den);
        System.out.println("Tích hai phân số = " + Mul.numerator + "/" + Mul.denominator);
    }
     
    public void div(Fraction ps) {
        int num = this.getNumerator() * ps.getDenominator();
        int den = this.getDenominator() * ps.getNumerator();
        Fraction Div = new Fraction(num, den);
        System.out.println("Thương hai phân số = " + Div.numerator + "/" + Div.denominator);
    }
     

}
        
        
    
    
        
    


