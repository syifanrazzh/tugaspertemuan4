package com.syifa.tugas4;

import java.util.Scanner;
public class Soal1 {

    public static void main(String args[]) {
    
    Scanner inputObj = new Scanner(System.in);
    System.out.print("Masukkan banyak perulangan : ");
    int n = inputObj.nextInt();
    
    for(int i=1; i<=n; i++){
        System.out.println("Saya senang belajar bahasa Java");
    }
        
    }
}
