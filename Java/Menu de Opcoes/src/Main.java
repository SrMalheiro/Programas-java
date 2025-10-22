import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Variaveis
        int opcao, Resultado;

        //Menu
        System.out.println("------------------------------------");
        System.out.println("-----------Menu de Opções-----------");
        System.out.println("------------------------------------");

        //Area Cliente e Programa e Resposta
        do {
            //Area Cliente
            System.out.println("Se quer realizar uma soma, escreva 1");
            System.out.println("Se quer realizar uma subtração, escreva 2");
            System.out.println("Se quer realizar uma multiplicação, escreva 3");
            System.out.println("Se quer sair, escreva 4");
            System.out.print("Opcao: ");
            opcao= scanner.nextInt();
            System.out.println();
            while (opcao<1||opcao>4)
            {
                System.out.println("OPÇÃO INVÁLIDA");
                System.out.println("Se quer realizar uma soma, escreva 1");
                System.out.println("Se quer realizar uma subtração, escreva 2");
                System.out.println("Se quer realizar uma multiplicação, escreva 3");
                System.out.println("Se quer sair, escreva 4");
                System.out.print("Opcao: ");
                opcao= scanner.nextInt();
                System.out.println();
            }

            //Programa
            if (opcao==1)
            {
                Resultado=Soma();
                System.out.println("O resultado da soma é: "+Resultado);
                System.out.println();
                System.out.println();
            }

            if (opcao==2)
            {
                Resultado=Subtracao();
                System.out.println("O resultado da subtração é: "+Resultado);
                System.out.println();
                System.out.println();
            }

            if (opcao==3)
            {
                Resultado=Multiplicacao();
                System.out.println("O resultado da multiplicação é: "+Resultado);
                System.out.println();
                System.out.println();
            }

            if (opcao==4)
            {
                System.out.print("A SAIR DO PROGRAMA, AGUARDE!");
            }
        } while (opcao!=4);
    }
    public static int Soma() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Insira o primeiro valor para a soma: ");
        int N1= scanner.nextInt();
        System.out.println();
        System.out.print("Insira o segundo valor para a soma: ");
        int N2= scanner.nextInt();
        System.out.println();
        return N1+N2;
    }

    public static int Subtracao() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Insira o primeiro valor para a subtracao: ");
        int N1= scanner.nextInt();
        System.out.println();
        System.out.print("Insira o segundo valor para a subtracao: ");
        int N2= scanner.nextInt();
        System.out.println();
        return N1-N2;
    }

    public static int Multiplicacao() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Insira o primeiro valor para a multiplicacao: ");
        int N1= scanner.nextInt();
        System.out.println();
        System.out.print("Insira o segundo valor para a multiplicacao: ");
        int N2= scanner.nextInt();
        System.out.println();
        return N1*N2;
    }
}