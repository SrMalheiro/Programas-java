import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Variaveis
        Scanner scanner= new Scanner(System.in);
        int IdadePessoa;
        //Menu
        System.out.println("--------------------------------------------------");
        System.out.println("-------------Programa de Idade Adulta-------------");
        System.out.println("--------------------------------------------------");
        System.out.println();
        //Area Cliente
        System.out.printf("Qual é a sua idade? ");
        IdadePessoa=scanner.nextInt();
        //Verificar Leitura de Idade
        System.out.println("A sua idade é "+IdadePessoa);
        //Programa
        if (IdadePessoa>17)
        {
            System.out.printf("Tens idade legal considerada adulta em Portugal");
        }
        else
        {
            System.out.printf("Tens idade legal NÃO considerada adulta em Portugal");
        }
    }
}