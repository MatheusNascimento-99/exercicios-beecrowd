package exercicios.beecrowd;

import java.util.Scanner;

public class Beecrowd1180 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vetor = new int[N];

        for(int i = 0; i < N; i++){
            vetor[i] = sc.nextInt();
        }
        int menorValor = vetor[0];
        int posicao = 0;

        for(int i = 0; i < N; i++){
            if(vetor[i] < menorValor){
                menorValor = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);

        sc.close();
    }
}
