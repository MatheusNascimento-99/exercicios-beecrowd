package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1080 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maiorValor = 0;
        int posicao = 0;
        for(int i = 1; i <= 100; i++){
            int X = sc.nextInt();
            if(i == 1){
                maiorValor = X;
                posicao = i;
            }
            else{
                if(X > maiorValor){
                    maiorValor = X;
                    posicao = i;
                }
            }
        }
        System.out.println(maiorValor);
        System.out.println(posicao);


        sc.close();
    }
}
