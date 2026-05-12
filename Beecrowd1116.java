package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            double divisao;
            if(Y == 0){
                System.out.println("divisao impossivel");
            }
            else{
                divisao = (double) X / Y;
                System.out.println(divisao);
            }
        }

        sc.close();


    }
}
