package exercicios.beecrowd;

import java.util.Scanner;

public class beecrowd1067 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for(int i=1; i<=x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        input.close();

    }
}
