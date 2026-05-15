package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1184 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char operacao = Character.toUpperCase(sc.next().charAt(0));

        double[][] matriz = new double[12][12];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }
        double soma = 0.0;
        int contador = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(j < i){
                    contador++;
                    soma += matriz[i][j];
                }
            }
        }

        if(operacao == 'S'){
            System.out.printf("%.1f%n",soma);
        }
        else if(operacao == 'M'){
            double media = soma / contador;
            System.out.printf("%.1f%n",media);
        }

        sc.close();
    }

}
