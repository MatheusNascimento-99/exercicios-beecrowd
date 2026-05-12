package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1153 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int fatorial = 1;
        for(int i=1; i<=x; i++){
            fatorial *= i;
        }
        System.out.println(fatorial);

        input.close();

    }
}
