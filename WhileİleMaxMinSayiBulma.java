package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sayi;
        int max = 0;
        int min = 0;
        int n;



        Scanner scanner = new Scanner(System.in);

        System.out.println("Ka� adet say� gireceksiniz ? : ");
        n = scanner.nextInt();
        int temp=n;
        int i=1;


        while (n > 0) {
            System.out.print(i + " . say�y� giriniz: ");
            sayi = scanner.nextInt();

            if (n == temp) {
                max = sayi;
                min = sayi;
            } else {
                if (sayi > max) {
                    max = sayi;
                }else if (sayi < min) {
                    min = sayi;
                }
            }
            i++;
            n--;


        } System.out.println("Girdi�iniz en b�y�k say� "+max);
        System.out.println("Girdi�iniz en k���k say� "+ min );
    }
}










