import javax.swing.*;

public class zobrazOkno {
    public static void main(String[] args) {
        Form zobraz = new Form();
        zobraz.pack();
        zobraz.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        zobraz.setVisible(true);
    }

}
