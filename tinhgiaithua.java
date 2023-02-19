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
public class tinhgiaithua {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Nhap vao so nguyen n: ");
            n = sc.nextInt();
        }while (n<0);
        long giaiThua = 1;
        for(int i = 1; i<=n; i++){
            giaiThua = giaiThua * i;
        }
        System.out.println(n + "! = " + giaiThua);
    }
}

