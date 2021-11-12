import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class Cadastro extends JFrame {
    private JPanel panel1;
    private JTextField tfNome;
    private JButton btSalvar;
    private JList lNome;
    private JList lIdade;
    private JList lEndereco;
    private JLabel lbNome;
    private JLabel lbIdade;
    private JLabel lbEndereco;
    private JTextField tfIdade;
    private JTextField tfEndereco;


    public static void main(String[] args) {
        JFrame c1 = new Cadastro("Cadastro");
        c1.setSize(new Dimension(600, 500));
        c1.setLocationRelativeTo(null);
        c1.setVisible(true);
    }

    private DefaultListModel listModelNome = new DefaultListModel();
    private DefaultListModel listModelIdade = new DefaultListModel();
    private DefaultListModel listModelEndereco = new DefaultListModel();
    public Cadastro(String title) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        btSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = tfNome.getText();
                String idade = tfIdade.getText();
                String endereco = tfEndereco.getText();
                listModelNome.addElement(nome);
                listModelIdade.addElement(idade);
                listModelEndereco.addElement(endereco);
                lNome.setModel(listModelNome);
                lIdade.setModel(listModelIdade);
                lEndereco.setModel(listModelEndereco);
            }
        });

    }
}
