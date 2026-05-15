package exercicios.beecrowd;

import java.util.Scanner;
public class Beecrowd1182 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        char operation = Character.toUpperCase(sc.next().charAt(0));


        double [][] matriz = new double[12][12];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextDouble();
            }
        }
        double average = 0.0;
        double sum = 0.0;

        for(int i = 0; i < matriz[column].length; i++){
            sum += matriz[i][column];
        }

        if(operation == 'S'){
            System.out.printf("%.1f%n",sum);
        }
        else if(operation == 'M'){
            average = sum / matriz[column].length;
            System.out.printf("%.1f%n",average);
        }

        sc.close();

    }
}
