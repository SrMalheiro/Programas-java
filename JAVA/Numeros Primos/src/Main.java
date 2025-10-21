import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Variaveis
        int NumeroInserido=0, Resposta=1;

        //Menu
        System.out.println("----------------------------------------------------------");
        System.out.println("-----------Programa de Verificar Números Primos-----------");
        System.out.println("----------------------------------------------------------");

        //Area Cliente
        System.out.printf("Insira um número inteiro: ");
        NumeroInserido= scanner.nextInt();
        System.out.println();

        //Programa
        for (int i = 2; i * i <= NumeroInserido; i++) {
            if (NumeroInserido % i == 0) {
                Resposta= 0;
            }
        }

        //Resposta
        if (Resposta==0) {
            System.out.println(NumeroInserido+" não é primo");
        }
        else {
            System.out.println(NumeroInserido+" é primo");
        }

    }
}