package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd2936 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int curupira = sc.nextInt();
        int boitata = sc.nextInt();
        int boto = sc.nextInt();
        int mapinguari = sc.nextInt();
        int iara = sc.nextInt();

        int total = 225 + (curupira*300) + (boitata * 1500) + (boto * 600) + (mapinguari * 1000) + (iara * 150);

        System.out.println(total);

        System.out.println();

        sc.close();
    }
}
