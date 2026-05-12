package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while(true){
            int M = sc.nextInt();
            int N = sc.nextInt();
            if(M <= 0 || N <= 0){
                break;
            }
            int max = Math.max(M, N);
            int min = Math.min(M, N);
            int soma = 0;
            for(int i = min; i <= max; i++){
                soma += i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + soma);

        }
        sc.close();
    }
}

