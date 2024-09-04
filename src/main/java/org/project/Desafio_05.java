package org.project;

import java.util.Scanner;

public class Desafio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Importa o Scanner para solicitar o imput

        //Solicita a entrada do usuário
        System.out.print("Informe a string para inverter: ");
        String original = scanner.nextLine(); //Ler a string informada

        //Chama o método para inversão
        String invertida = inverterString(original);
        System.out.println("String invertida: " + invertida);

        scanner.close();//Fecha o scanner
    }

    //Função que fará o processo de inversão dos caracteres
    public static String inverterString(String str) {
        // Cria um StringBuilder com o comprimento da string original
        StringBuilder stringDeEntrada = new StringBuilder(str.length());

        //Itera sobre a string original do final para o início
        for (int i = str.length() - 1; i >= 0; i--) {
            stringDeEntrada.append(str.charAt(i));
        }

        return stringDeEntrada.toString();
    }
}
