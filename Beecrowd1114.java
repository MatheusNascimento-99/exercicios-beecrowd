package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int tentativa = sc.nextInt();
        while(tentativa != senha){
            System.out.println("Senha Invalida");
            tentativa = sc.nextInt();
        }
        if (tentativa == senha) {
            System.out.println("Acesso Permitido");
        }

        sc.close();



    }
}
