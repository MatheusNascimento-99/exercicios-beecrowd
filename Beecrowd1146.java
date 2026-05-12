package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1146 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        while (x != 0) {

            for (int i = 1; i <= x; i++) {

                if (i == x) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }

            }

            System.out.println();
            x = input.nextInt();
        }

        input.close();
    }
}
