package com.syifa.tugas4;

import java.util.Scanner;

public class Soal2 {

    public static void main(String args[]) {
     Scanner inputObj = new Scanner(System.in);
        System.out.print("Masukkan batas awal : ");
        int awal = inputObj.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int akhir = inputObj.nextInt();
        
        int jumlah = 0;
        int i = awal;
        
        while(i<=akhir){
            if(i%2==0){
                jumlah += i;
            }
            i++;
        }
        System.out.println("Jumlah bilangan genap dari "+awal+" - "+akhir+" adalah " +jumlah);
    }
}
