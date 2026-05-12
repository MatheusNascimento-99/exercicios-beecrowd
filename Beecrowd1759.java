package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1759 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for(int i = 1; i <= X; i++){
            if(i != X){
                System.out.print("Ho ");
            }
            else{
                System.out.print("Ho!");
                System.out.println();
            }
        }

        sc.close();
    }
}
