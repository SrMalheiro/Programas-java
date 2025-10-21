import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random=new Random();
        //Variaveis
        int NumeroRandom, AdivinhaDoCliente=-1;

        //Menu
        System.out.println("----------------------------------------------------------");
        System.out.println("-----------Programa do Cliente Adivinhar Número-----------");
        System.out.println("----------------------------------------------------------");

        //Programa 1
        NumeroRandom= random.nextInt(100);
        //System.out.println(NumeroRandom); //Verificar se realmente funciona

        //Area Cliente, Programa e Resposta

        System.out.println("Faça as suas apostas e escreva um número entre 0 e 100! ");
        do {
            AdivinhaDoCliente=scanner.nextInt();
            while (AdivinhaDoCliente<0||AdivinhaDoCliente>100)
            {
                System.out.println("INSIRA UM NÚMERO INTEIRO QUE ESTEJA COMPREENDIDO ENTRE 0 E 100!!!!!");
                AdivinhaDoCliente=scanner.nextInt();
            }
            if (AdivinhaDoCliente<NumeroRandom)
            {
                System.out.println("Insira um número maior!");
            }
            if (AdivinhaDoCliente>NumeroRandom)
            {
                System.out.println("Insira um número menor!");
            }
            if (AdivinhaDoCliente==NumeroRandom){
                System.out.println("ACERTOU!!!!!! Agora joga no EuroMilhões.");
            }
        } while (AdivinhaDoCliente!=NumeroRandom);
    }
}