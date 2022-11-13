package exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Input Uang: ");
            float inputUang = s.nextFloat();

            // float inputUang = 485300;
            // float inputUang = 400000;
            // float inputUang = 100220;

            float nominal[] = { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50 };
            StringBuilder result = new StringBuilder();
            for (float v : nominal) {
                int lembar = 0;
                float nilai = 0;
                do {
                    nilai += v;
                    lembar++;
                } while (nilai + v <= inputUang);
                if (inputUang - nilai > 0) {
                    inputUang = inputUang - nilai;
                    result.append(lembar + " lembar pecahan " + v + ", ");
                } else if (nilai == inputUang) {
                    inputUang = inputUang - nilai;
                    result.append(lembar + " lembar pecahan " + v);
                }

                if (v == 50 && inputUang != 0) {
                    result = new StringBuilder("Maaf, uang tidak memiliki pecahan yang benar");
                }

                nilai = 0;
                lembar = 0;
            }

            System.out.println(result);
        }
    }
}
