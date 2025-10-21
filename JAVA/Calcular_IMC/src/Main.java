import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Variaveis
        float Peso=0, Altura=0, IMC=0;
        //Menu
        System.out.println("----------------------------------------------------------------------");
        System.out.println("--------------------------Calcular o seu IMC--------------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("NO PROGRAMA PARA INDICAR GRAMAS E/OU CENTIMETROS USE A VÍRGULA AO INVÉS DE PONTO!!!");
        System.out.println();

        //Area Cliente
        System.out.printf("Insira o seu peso em kilos. (Ex: 73,4)- ");
        Peso=scanner.nextFloat();

        System.out.println();

        System.out.printf("Insira a sua altura em metros. (Ex: 1,73)- ");
        Altura=scanner.nextFloat();

        //Verificar leituras e/ou erros
        System.out.println("Peso: "+Peso);
        System.out.println("Altura: "+Altura);

        //Programa e resposta
        IMC=Peso/(Altura*Altura);

        if (IMC<18.5)
        {
            System.out.println("Abaixo do Peso");
        }

        if (IMC>=18.5 && IMC<25)
        {
            System.out.println("Peso normal");
        }

        if (IMC>=25 && IMC<30)
        {
            System.out.println("Sobrepeso");
        }

        if (IMC>=30 && IMC<35)
        {
            System.out.println("Obesidade grau 1");
        }

        if (IMC>=35 && IMC<39.9)
        {
            System.out.println("Obesidade grau 2");
        }

        if (IMC>=39.9)
        {
            System.out.println("Obesidade grau 3 (mórbida)");
        }
        System.out.println("O seu IMC é "+IMC);
    }
}