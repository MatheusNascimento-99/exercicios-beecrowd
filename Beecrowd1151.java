package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1151 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int f1 = 0;
        int f2 = 1;

        System.out.print(f1);

        for (int i = 2; i <= N; i++) {
            System.out.print(" " + f2);

            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        System.out.println();
        sc.close();
    }
}

