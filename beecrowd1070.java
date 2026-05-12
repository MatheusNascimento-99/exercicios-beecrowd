package exercicios.beecrowd;

import java.util.Scanner;

public class beecrowd1070 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if (x % 2 == 0) {
            x++;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println(x);
            x += 2;
        }
        input.close();
    }
}

