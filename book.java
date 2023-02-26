/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author nhu quynh
 */
public class book {
   public String boCode;
public String boTittle;
public String boAuthor;

public book(String boCode, String boTittle, String boAuthor){
  this.boCode = boCode;
  this.boTittle = boTittle;
   this.boAuthor = boAuthor;
}

public void setStID(String stID){
    this.boCode = boCode;
}
public void setStName(String stName){
    this.boTittle = boTittle;
}
public void setStClass(String stClass){
    this.boAuthor = boAuthor;
}
public String getBoTittle(){
    return boTittle;
}
public String getBoCode(){
    return boCode;
}
public String getBoAuthor(){
    return boAuthor;
}
public String toString(){
    return boCode +""+ boTittle +""+ boAuthor;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     book s1 = new book("ma01","laptrinhcanban","Quynh");
     System.out.print(s1)   ;
    }}


