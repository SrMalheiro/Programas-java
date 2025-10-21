import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Variaveis
        int Numero=0, NumeroLoopFor, TabuadaLoopFor=0;

        //Menu
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("--------------------------Tabuada de qualquer número--------------------------");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("ESTE PROGRAMA CONTA O NÚMERO VEZES 1,2,3 ATÉ 10!!!");
        System.out.println();

        //Area Cliente
        System.out.printf("Insira o número que quer saber a tabuada- ");
        Numero=scanner.nextInt();

        System.out.println();

        //Verificar leituras e/ou erros
        //System.out.println("Numero inserido: "+Numero);

        //Programa e resposta
        for (NumeroLoopFor=0; NumeroLoopFor<11; NumeroLoopFor++)
        {
            TabuadaLoopFor=NumeroLoopFor*Numero;
            System.out.printf(NumeroLoopFor+"x"+Numero+"="+TabuadaLoopFor);
            System.out.println();
        }
    }
}