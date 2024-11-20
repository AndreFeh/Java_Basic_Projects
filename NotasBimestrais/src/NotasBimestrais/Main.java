package NotasBimestrais;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite sua nota1: ");
        float nota1 = scan.nextFloat();
        System.out.println("Digite sua nota2: ");
        float nota2 = scan.nextFloat();
        System.out.println("Digite sua nota3: ");
        float nota3 = scan.nextFloat();
        System.out.println("Digite sua nota4: ");
        float nota4 = scan.nextFloat();

        System.out.println("Suas notas foram: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
        float resultado = (nota1 + nota2 + nota3 + nota4);
        float media = resultado/4;

        System.out.println("Sua Média Final É: " + media);
    }

}
