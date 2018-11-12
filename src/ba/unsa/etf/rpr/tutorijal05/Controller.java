package ba.unsa.etf.rpr.tutorijal05;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.awt.event.ActionEvent;

public class Controller{
    private Button posto, podeljeno, zbrajanje, mnozenje, oduzimanje;
    private Button nula, broj1, broj2, broj3, broj4, broj5, broj6, broj7, broj8, broj9;
    private TextField poljeTeksta;

    public void handleButtonAction(ActionEvent event) {
        if (event.getSource() == posto) {
            poljeTeksta.setText("%");
        }
        else if (event.getSource() == posto) {
            poljeTeksta.setText("%");
        }
    }
}
