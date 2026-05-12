package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1154 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        while(true){
            int idade = input.nextInt();
            if(idade < 0){
                break;
            }
            soma += idade;
            contador++;

        }
        double media = (double) soma / contador;
        System.out.printf("%.2f%n",media);

        input.close();

    }
}
