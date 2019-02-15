package com.mustafarasit.example;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); //metod'un çalışma süresini hesaplıyoruz.
        int[] list = getRandomList(1000); // 1000 adet rastgele sayı üretiyoruz.

        for (int a = 0; a < list.length; a++) { // array'ın ilk hali
            System.out.print(list[a] + ",");
        }

        // algoritma kısmı
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < (list.length - 1); j++) {

                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int a = 0; a < list.length; a++) { //array'ın son hali
            System.out.print(list[a] + ",");
        }
        long endTime = System.nanoTime();
        long estimatedTime = endTime - startTime; // Geçen süreyi nanosaniye cinsinden elde ediyoruz
        double seconds = (double) estimatedTime / 1000000000; // saniyeye çevirmek için milyar'a bölüyoruz.
        System.out.println();
        System.out.println(seconds);
    }

    public static int[] getRandomList(int count) {
        int[] list = new int[count];

        Random rnd = null;
        for (int i = 0; i < count; i++) {
            rnd = new Random();
            list[i] = rnd.nextInt(100);
        }
        return list;
    }
}
