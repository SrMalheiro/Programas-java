import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variaveis
        int Numeros=0, SomaNumerosLoop=0;

        //Menu
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("--------------------------Soma de Números Inseridos--------------------------");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("QUANDO O NÚMERO FOR 0, O PROGRAMA IRÁ PARAR DE SOMAR!!!");
        System.out.println();

        //Area Cliente e Programa
        do {
            System.out.printf("Insira número- ");
            Numeros = scanner.nextInt();
            SomaNumerosLoop=SomaNumerosLoop+Numeros;
        }while (Numeros != 0);
        System.out.println();
        //Resposta
        System.out.println("A soma de todos os números inseridos é igual a: "+SomaNumerosLoop);
    }
}