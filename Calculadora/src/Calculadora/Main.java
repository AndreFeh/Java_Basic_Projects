package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        float num1 = scan.nextFloat();
        System.out.println("Digite um numero");
        float num2 = scan.nextFloat();

        Soma.soma(num1, num2);
        Subtracao.subtracao(num1,num2);
        Divisao.divisao(num1,num2);
        Multiplicação.multiplicacao(num1,num2);
    }
}
