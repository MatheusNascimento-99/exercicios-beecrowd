package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1099 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i<=N; i++){
            int soma = 0;
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int max = Math.max(X, Y);
            int min = Math.min(X, Y);
            for (int j=min+1; j<max; j++){
                if(j % 2 != 0){
                    soma += j;
                }
            }
            System.out.println(soma);
        }

        sc.close();
    }
}
