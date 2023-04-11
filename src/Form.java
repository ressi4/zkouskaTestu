import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class Form extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton buttonPredchozi;
    private JButton buttonDalsi;
    private JTextField textField3;
    private JCheckBox checkBox1;

    JFileChooser vyber = new JFileChooser();

    public Form() {
        setContentPane(mainPanel);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu soubor = new JMenu("Soubor");
        menuBar.add(soubor);
        JMenuItem nacteni = new JMenuItem("Načti");
        soubor.add(nacteni);



        buttonPredchozi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonDalsi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        nacteni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nactiSoubor(vyber());
            }
        });
    }
    private File vyber(){
        int nacti = vyber.showSaveDialog(mainPanel);
        if(nacti ==vyber.APPROVE_OPTION){
            return vyber.getSelectedFile();
        }
        return null;
    }

    private void nactiSoubor(File soubor){

        try {
            Scanner scanner = new Scanner(soubor);
            while(scanner.hasNextLine()){
                
                textField1.setText(scanner.nextLine());
                textField2.setText(scanner.nextLine());
                String text="ano";
                if(text=="ano"){
                    checkBox1.setSelected(true);
                }
                else{
                    checkBox1.setSelected(false);
                }
                textField3.setText(scanner.nextLine());
            }
            scanner.close();
        }

        catch (IOException e) {
            chyba();
        }
    }
private void chyba(){
        JOptionPane.showMessageDialog(mainPanel,"Chyba v načtení souboru.");
}

}
