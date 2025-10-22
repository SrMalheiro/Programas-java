import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicializar
        Scanner scanner = new Scanner(System.in);

        //Variaveis
        int NumerosDados=0, NumeroEscrito;

        //Menu
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-------------Sistema de cálculo de numeros pares até ao numero escrito-------------");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println();

        //Area cliente
        System.out.print("Escreva um número par. R: ");
        System.out.println();
        NumeroEscrito = scanner.nextInt();

        //Programa
            //Ver par ou Impar
        int ParOuImpar=NumeroEscrito%2;
        if (ParOuImpar==0){}
        else
        {
            NumeroEscrito=NumeroEscrito-1;
        }
            //Programa de escrever
        do {
            System.out.println(NumerosDados);
            NumerosDados=NumerosDados+2;
        } while (NumeroEscrito != NumerosDados-2);
    }
}