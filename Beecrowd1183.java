package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1183 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char operation = Character.toUpperCase(sc.next().charAt(0));

        double [][] matriz = new double[12][12];

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }

        double soma = 0.0;
        int cont = 0;

        for(int i = 0; i < 12; i++){
            for( int j = 0; j < 12; j++){
                if(j > i){
                    cont++;
                    soma += matriz[i][j];
                }
            }
        }
        if(operation == 'S'){
            System.out.printf("%.1f%n",soma);
        }
        else if(operation == 'M'){
            double media = soma / cont;
            System.out.printf("%.1f%n",media);
        }

        sc.close();
    }
}
