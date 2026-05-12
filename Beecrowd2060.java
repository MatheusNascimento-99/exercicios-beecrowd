package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd2060 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int multiplosDe2 = 0;
        int multiplosDe3 = 0;
        int multiplosDe4 = 0;
        int multiplosDe5 = 0;

        for(int i = 1; i <= N; i++){
            int num = sc.nextInt();
            if(num % 2 == 0){
                multiplosDe2++;
            }
            if(num % 3 == 0){
                multiplosDe3++;
            }
            if(num % 4 == 0){
                multiplosDe4++;
            }
            if(num % 5 == 0){
                multiplosDe5++;
            }
        }

        System.out.println(multiplosDe2 + " Multiplo(s) de 2");
        System.out.println(multiplosDe3 + " Multiplo(s) de 3");
        System.out.println(multiplosDe4 + " Multiplo(s) de 4");
        System.out.println(multiplosDe5 + " Multiplo(s) de 5");

        sc.close();

    }
}
