package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1181 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        double [][] matriz = new double[12][12];

        int line = sc.nextInt();
        char operation = Character.toUpperCase(sc.next().charAt(0));

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }
        double soma = 0.0;
        double media = 0.0;

        for(int j = 0; j < matriz[line].length; j++){
            soma += matriz[line][j];
        }

        if(operation == 'S'){
            System.out.println(soma);
        }
        else if (operation == 'M'){
            media = soma / matriz[line].length;
            System.out.println(media);
        }

        sc.close();

    }

}
