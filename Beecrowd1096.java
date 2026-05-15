package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1096 {
    public static void main(String [] agrs){

        Scanner sc = new Scanner(System.in);

        int i = 1;
        int j = 7;
        while(i <= 9){
            System.out.println("I="+i+" J="+j);
            System.out.println("I="+i+" J="+(j-1));
            System.out.println("I="+i+" J="+(j-2));
            i+=2;


        }

        sc.close();
    }
}
