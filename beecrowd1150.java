package exercicios.beecrowd;

import java.util.Scanner;

public class beecrowd1150 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int z = input.nextInt();
        while(z <= x){
            z = input.nextInt();
        }
        int numero = x;
        int soma = 0;
        int cont = 0;

        while(soma <= z){
            soma+=numero;
            numero++;
            cont++;
        }
        System.out.println(cont);


        input.close();


    }
}
