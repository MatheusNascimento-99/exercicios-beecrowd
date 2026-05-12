package exercicios.beecrowd;

import java.util.Scanner;

public class beecrowd1173 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int x = input.nextInt();
            int [] array = new int[10];
            for(int i=0; i<array.length; i++){
                array[i] = x;
                x = x*2;
            }
            for(int i=0; i<array.length; i++){
                System.out.println("N["+i+"] = " + array[i]);
            }

            input.close();


        }

}
