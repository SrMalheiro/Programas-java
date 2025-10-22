import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Variaveis
        int Operacao;
        float Numero1=0, Numero2=0, Resposta=0;

        //Menu
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------Programa de Calculadora Simples-----------");
        System.out.println("-----------------------------------------------------");

        //Area Cliente
        System.out.println("Se quer realizar uma soma escreva 1");
        System.out.println("Se quer realizar uma subtração escreva 2");
        System.out.println("Se quer realizar uma multiplicação escreva 3");
        System.out.println("Se quer realizar uma divisão escreva 4");
        System.out.printf("Escolha: ");
                Operacao= scanner.nextInt();

        System.out.println("Insira o primeiro número: ");
                Numero1= scanner.nextFloat();
        System.out.println("Insira o segundo número: ");
                Numero2= scanner.nextFloat();

        //Programa
        switch (Operacao) {
            case 1:
                Resposta = Numero1 + Numero2;
                break;
            case 2:
                Resposta = Numero1 - Numero2;
                break;
            case 3:
                Resposta = Numero1 * Numero2;
                break;
            case 4:
                Resposta = Numero1 / Numero2;
                break;
        }

        //Resposta
        System.out.println("Resposta: " + Resposta);
    }
}