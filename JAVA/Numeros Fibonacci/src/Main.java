import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Variaveis
        int NumeroSequencia, f1, t1=0, t2=1, ProximoTermo;

        //Menu
        System.out.println("--------------------------------------------------");
        System.out.println("-----------Cálculo de Números Fibonacci-----------");
        System.out.println("--------------------------------------------------");

        //Area Cliente
        System.out.print("Quantos números da sequência quer ver? ");
        NumeroSequencia= scanner.nextInt();
        System.out.println();
        while (NumeroSequencia<0||NumeroSequencia>47)
        {
            System.out.println("Valor Invalido Dado Os Limites Da Plantaforma");
            System.out.print("Quantos números da sequencia quer ver? -> ");
            NumeroSequencia= scanner.nextInt();
        }
        System.out.println();

        //Programa
        if (NumeroSequencia >= 1) {
            System.out.println(t1+", ");
        }

        for (f1 = 2; f1 <= NumeroSequencia; f1++) {
            ProximoTermo = t1 + t2;
            System.out.println(ProximoTermo+", "); // Imprime o próximo termo
            t1 = t2;
            t2 = ProximoTermo;
        }
    }
}