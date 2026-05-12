package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1079 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();
            double media = ((nota1 * 2 ) + (nota2 * 3) + (nota3 * 5)) / 10;
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
