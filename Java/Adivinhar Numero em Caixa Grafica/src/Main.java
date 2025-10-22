import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame {
    Random random = new Random();
    int NumeroRandom;
    int AdivinhaCliente = -1;

    public Main() {
        //Menu Gráfico
        setTitle("Programa do Cliente Adivinhar Número");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Layout
        setLayout(new FlowLayout());

        //Definição do Número
        NumeroRandom = random.nextInt(100);

        //Programa
        JTextField inserirDados = new JTextField(20);
        JLabel mensagemDados = new JLabel("Insira a sua tentativa:");
        JButton butaoEnviar = new JButton("Enviar");

        butaoEnviar.addActionListener(_ -> {
            try {
                AdivinhaCliente = Integer.parseInt(inserirDados.getText());
                if (AdivinhaCliente < 0 || AdivinhaCliente > 100) {
                    JOptionPane.showMessageDialog(this, "Insira um número inteiro entre 0 e 100!");
                } else if (AdivinhaCliente < NumeroRandom) {
                    JOptionPane.showMessageDialog(this, "Insira um número maior!");
                } else if (AdivinhaCliente > NumeroRandom) {
                    JOptionPane.showMessageDialog(this, "Insira um número menor!");
                } else {
                    JOptionPane.showMessageDialog(this, "ACERTOU! Agora joga no EuroMilhões.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um número válido!");
            }
        });

        // Adicionar ao layout
        add(mensagemDados);
        add(inserirDados);
        add(butaoEnviar);
    }
    public static void main (String[]args){
        new Main().setVisible(true);
    }
}
