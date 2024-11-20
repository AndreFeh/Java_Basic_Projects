package Main;

import java.util.Scanner;

public class Calculo {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Insira um numero inteiro: ");
        int num1 =scan.nextInt();

        System.out.println("Insira mais um numero inteiro: ");
        int num2 =scan.nextInt();

        int total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);

    }
}
