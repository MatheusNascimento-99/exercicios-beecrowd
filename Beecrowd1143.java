package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1143 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for(int i=1; i<=x; i++){
            System.out.printf("%d %d %d%n",i,i*i,i*i*i);
        }

        input.close();


    }

}
