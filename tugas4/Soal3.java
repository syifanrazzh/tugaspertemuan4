package com.syifa.tugas4;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        int a = inputObj.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = inputObj.nextInt();
        
        int pbt = hitung(a, b);
        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah: " + pbt);
        
    }
    
    public static int hitung(int a, int b) {
        while (b != 0) { 
            int temp = b;
            b = a % b; 
            a = temp; 
        }
        return a; 
    }
}
