package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1071 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        for(int i=min+1; i<max; i++){
            if(i % 2 != 0){
                soma += i;
            }
        }
        System.out.println(soma);

        sc.close();
    }
}
