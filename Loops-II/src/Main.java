import java.util.Scanner;

// TODO: A primeira linha contém um número inteiro, q , denotando o número de consultas.
// TODO: Cada linha i das linhas q subsequentes contém três inteiros separados por espaço que descrevem os respectivos , e  valores para essa consulta.

/**
 * Challenge HackerRank www.hackerrank.com/challenges/java-loops...
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines, numberA, numberB, c, n;
        lines = scan.nextInt();


        for (int i = 0; i < lines; ++i) { //part1 OK
            numberA = scan.nextInt();
            numberB = scan.nextInt();
            c = 0; /*?????????*/
            n = scan.nextInt();
            for (int j = 0; j < n; ++j) {
                System.out.print(numberA + c + numberB);
                c += numberB;
                numberB *= 2;
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}

//TIVE QUE PEGAR DO STACK OVERFLOW, NAO ENTENDO A LOGICA DESSE CODIGO