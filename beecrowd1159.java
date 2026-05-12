package exercicios.beecrowd;

import java.util.Scanner;

public class beecrowd1159 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            int X = input.nextInt();
            if(X == 0){
                break;
            }
            int soma = 0;
            if (X % 2 != 0){
                X += 1;
            }
            int numeroAtual = X;
            for(int i=1; i<=5; i++){
                soma += numeroAtual;
                numeroAtual+=2;
            }

            System.out.println(soma);
        }

    }
}
