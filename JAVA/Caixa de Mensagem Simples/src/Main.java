import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Caixa de Mensagem Simples em Java Swing");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());

        JButton butaoMensagem = new JButton("Clique aqui");
        JButton butaoSair = new JButton("Sair");

        butaoMensagem.addActionListener(_ -> JOptionPane.showMessageDialog(null, "Olá, seja bem-vindo ao meu primeiro painel em Java."));
        butaoSair.addActionListener(_ -> System.exit(0));
        add(butaoMensagem);
        add(butaoSair);
    }
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}