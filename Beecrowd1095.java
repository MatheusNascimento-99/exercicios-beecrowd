package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1095 {
    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);

        int j = 60;
        int i = 1;

        while(j >= 0 ){
            System.out.println("I="+i+" J="+j);
            j-=5;
            i+=3;
        }

        sc.close();

    }
}
