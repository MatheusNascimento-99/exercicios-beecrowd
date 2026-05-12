package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1144 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            int segundo = i*i;
            int terceiro = i*i*i;

            System.out.printf("%d %d %d%n",i,segundo,terceiro);
            System.out.printf("%d %d %d%n", i,segundo+1,terceiro+1);
        }

        sc.close();

    }
}
