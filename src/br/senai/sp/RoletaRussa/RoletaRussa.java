package br.senai.sp.RoletaRussa;

import java.util.Random;
import java.util.Scanner;

/**
 * Roleta Russa
 * Data: 17/08/2023
 * Autor: Vinicius Selhorst
 */

public class RoletaRussa {

    public static void main(String[] args) {

        /** Declarar Variaveis */
        int numberUser, numberRandom, outraRodada;
        String name;
        boolean continuar = true;
        int money = 0;

        /** Instanciar Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instanciar Random */
        Random random = new Random();

        /** Coletar Dados */

        System.out.println("=======================================\n");
        System.out.println("=========== Número da Sorte ===========");
        System.out.println("\n======================================\n");
        System.out.println("COMO FUNCIONA: Se voce acertar o numero da sorte que é gerado automaticamente, ganha o premio de R$20,00. ");
        System.out.println("Cada tentativa custa R$1,00");
        System.out.print("\nQual seu Nome: ");
        name = teclado.next();
        System.out.println("\nOlá " + name + ", Vamos Jogar!");


        System.out.print("Digite um Número de 0 à 10: ");
        numberUser = teclado.nextInt();


        while (continuar) {
            numberRandom = random.nextInt(10) + 1;
            System.out.println("Número da Sorte é " + numberRandom);

            if (numberUser == numberRandom) {

                System.out.println("Parabéns, voce ganhou R$20,00");
                continuar = false;
            } else {
                money = money + 1;
                System.out.println("\n==========================================================");
                System.out.println("Voce gastou R$" + money + ",00");
                System.out.print("Outra chance custa R$1,00, quer continuar? [1- yes / 2- no]: ");
                outraRodada = teclado.nextInt();

                switch (outraRodada) {
                    case 1:
                        System.out.print("Digite outro numero: ");
                        numberUser = teclado.nextInt();
                        break;
                    case 2:
                        continuar = false;
                        break;


                }
            }
        }

    }
}
