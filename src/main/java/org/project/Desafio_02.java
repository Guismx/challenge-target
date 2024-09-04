//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a
// soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um
// programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci
// e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
//
//IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

package org.project;

import java.util.Scanner;

public class Desafio_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Importar scanner para receber input
        int receberNumero; //Receber valor informado pelo usuário

        System.out.println("Digite um número: ");
        receberNumero = teclado.nextInt();

        //Valores que inicia e realizará o cálculo
        int valorInicial = 0;
        int valorParaSoma = 1;

        //Verificar se o número inicial é 0 ou 1, que sempre pertencem à sequência
        if (receberNumero == 0 || receberNumero == 1) {
            System.out.println("O número " + receberNumero + " pertence à sequência de Fibonacci.");
            return;
        }

        //Calcula a sequência de Fibonacci e verificar se o número informado é pertencente
        int fibonacci = valorInicial + valorParaSoma;
        while (fibonacci <= receberNumero) {
            if (fibonacci == receberNumero) {
                System.out.println("O número " + receberNumero + " pertence à sequência de Fibonacci.");
                return;
            }
            //Atualiza os valores de valorInicial e valorParaSoma para os próximos na sequência
            valorInicial = valorParaSoma;
            valorParaSoma = fibonacci;
            fibonacci = valorInicial + valorParaSoma;
        }

        System.out.println("O número " + receberNumero + " não pertence à sequência de Fibonacci.");
    }

}

