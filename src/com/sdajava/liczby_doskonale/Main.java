package com.sdajava.liczby_doskonale;

public class Main {

    private static int[] liczby;

    public static void main(String[] args) {

        int liczby_znalezione = 0;
        int x = 1;
        int suma_dzielnikow = 0;
        liczby = new int[3];

        while (liczby_znalezione < 3) {

            for (int i = 1; i <= (x/2); i++) {
                if ((x % i) == 0)
                    suma_dzielnikow += i;
            }
            if (suma_dzielnikow == x) {
                liczby[liczby_znalezione] = x;
                ++liczby_znalezione;
            }
            ++x;
            suma_dzielnikow = 0;
        }
        System.out.println("Trzy pierwsze liczby doskonale:");;
        for (int e : liczby) {
            System.out.print(e + ", ");
        }
    }
}