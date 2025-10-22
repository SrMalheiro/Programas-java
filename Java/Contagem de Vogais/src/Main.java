import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Variaveis
        int Na=0, Ne=0, Ni=0, No=0, Nu=0, NAcentos=0, NVogais;
        String Frase;
        String Acentos = "áàãâèéêíìîõóôòùúû";
        String VogalA = "Aa", VogalE = "Ee", VogalI = "Ii", VogalO = "Oo", VogalU = "Uu";

        //Menu
        System.out.println("----------------------------------------------------");
        System.out.println("-----------Programa de Contagem de Vogais-----------");
        System.out.println("----------------------------------------------------");

        //Area Cliente
        System.out.print("Digite uma frase: ");
        Frase= scanner.nextLine();
        System.out.println();

        //Programa
        for (char c : Frase.toCharArray()) {
            if (Acentos.indexOf(c) != -1) {
                NAcentos++; // Contar caracteres com acento
            }
            if (VogalA.indexOf(c) != -1) {
                Na++; // Contar vogais A (com ou sem acento)
            }
            if (VogalE.indexOf(c) != -1) {
                Ne++; // Contar vogais E (com ou sem acento)
            }
            if (VogalI.indexOf(c) != -1) {
                Ni++; // Contar vogais I (com ou sem acento)
            }
            if (VogalO.indexOf(c) != -1) {
                No++; // Contar vogais O (com ou sem acento)
            }
            if (VogalU.indexOf(c) != -1) {
                Nu++; // Contar vogais U (com ou sem acento)
            }
        }
        NVogais=Na+Ne+Ni+No+Nu;

        //Resposta
        System.out.println("Quantidade de Vogais com Acentos: "+NAcentos);
        System.out.println("Quantidade de Vogais simples: "+NVogais);
        System.out.println("Quantidade de Vogais A simples: "+Na);
        System.out.println("Quantidade de Vogais E simples: "+Ne);
        System.out.println("Quantidade de Vogais I simples: "+Ni);
        System.out.println("Quantidade de Vogais O simples: "+No);
        System.out.println("Quantidade de Vogais U simples: "+Nu);

    }
}