package TabelaIMC;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//		TITTLE
        System.out.println ("Calculo com base em Seu Peso e Altura");

        System.out.println("Sua Altura: ");
        float altura = scan.nextFloat();
        System.out.println("Seu Peso: ");
        float peso = scan.nextFloat();

        System.out.println("PESO DIVIDIDO POR (ALTURAxALTURA)");
        float imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 16.0) {
            System.out.println("Você está em Baixo peso muito grave: IMC abaixo de 16!");
        } else if (imc <= 16.99) {
            System.out.println("Você está em Grave: IMC entre 16 e 16,99;");
        } else if (imc <= 18.49) {
            System.out.println("Você está em Baixo peso: IMC entre 17 e 18,49");
        } else if (imc <= 24.99) {
            System.out.println("Você está com Peso normal: IMC entre 18,50 e 24,99");
        } else if (imc <=29.99) {
            System.out.println("Você está em Sobrepeso: IMC entre 25 e 29,99");
        } else if (imc <=34.99) {
            System.out.println("Você está em Obesidade Grau I: IMC entre 30 e 34,99");
        } else if (imc <= 39.99) {
            System.out.println("Você está em Obesidade Grau II: IMC entre 35 e 39,99");
        } else if (imc >= 40.0) {
            System.out.println("Você está em Obesidade Grau III (obesidade mórbida): IMC maior que 40");
        } else System.out.println("ERRO: Algum dado está incorreto! Tente Novamente!");
    }
}
