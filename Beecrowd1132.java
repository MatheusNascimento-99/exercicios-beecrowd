package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int max = Math.max(X, Y);
        int min = Math.min(X, Y);
        int soma = 0;

        for(int i = min; i <= max; i++){
            if(i % 13 != 0){
                soma += i;
            }
        }
        System.out.println(soma);

        sc.close();

    }
}
