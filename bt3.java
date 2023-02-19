/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabt1;
import java.util.Scanner;
 

/**
 *
 * @author nhu quynh
 */
public class bt3 {
  public static void main(String[] args)
  {   
   int x, y;
   Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
       x = sc.nextInt();
        if (x < 50){
            y = x * 1000;
        }else{
            y = 50*1000 + (x - 50) * 1200;
        }
        System.out.println("Tien dien la: "+ y);
   }
}
