package exercicios.beecrowd;

import java.util.Scanner;

public class beecrowd1094 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int numberOfTestCases = input.nextInt();
            int totalCoelhos = 0;
            int totalRatos = 0;
            int totalSapos = 0;
            int totalCobaias = 0;
            for(int i=0; i<numberOfTestCases; i++){
                int quantidadeAnimais = input.nextInt();
                char animal = Character.toUpperCase(input.next().charAt(0));
                if(animal == 'C'){
                    totalCoelhos+=quantidadeAnimais;
                }
                else if(animal == 'R'){
                    totalRatos+=quantidadeAnimais;
                }
                else if(animal == 'S'){
                    totalSapos+=quantidadeAnimais;
                }
                totalCobaias+=quantidadeAnimais;
            }
            double porcentagemCoelhos = (double) totalCoelhos/totalCobaias * 100;
            double porcentagemRatos = (double) totalRatos/totalCobaias * 100;
            double porcentagemSapos = (double) totalSapos/totalCobaias * 100;

            System.out.println("Total: " + totalCobaias + " cobaias");
            System.out.println("Total de coelhos: " + totalCoelhos);
            System.out.println("Total de ratos: " + totalRatos);
            System.out.println("Total de sapos: " + totalSapos);
            System.out.printf("Percentual de coelhos: %.2f %%%n",porcentagemCoelhos);
            System.out.printf("Percentual de ratos: %.2f %%%n",porcentagemRatos);
            System.out.printf("Percentual de sapos: %.2f %%%n",porcentagemSapos);

            input.close();
        }
    }





