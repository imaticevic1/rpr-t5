package ba.unsa.etf.rpr.tutorijal05;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller{
public TextField poljeTeksta;
public Button dotBtn;
    public void display(javafx.event.ActionEvent actionEvent) {
    }
    public void postotak(javafx.event.ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%") &&
        !poljeTeksta.getText().endsWith("/") && !poljeTeksta.getText().endsWith("X") &&
                !poljeTeksta.getText().endsWith("-") && !poljeTeksta.getText().endsWith("+")
                && !poljeTeksta.getText().equals("")
                && !poljeTeksta.getText().endsWith("."))
            poljeTeksta.setText(poljeTeksta.getText() + "%");
    }

    public void podijeli(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%") &&
                !poljeTeksta.getText().endsWith("/") && !poljeTeksta.getText().endsWith("X") &&
                !poljeTeksta.getText().endsWith("-") && !poljeTeksta.getText().endsWith("+") &&
                        !poljeTeksta.getText().equals("")
                && !poljeTeksta.getText().endsWith("."))
        poljeTeksta.setText(poljeTeksta.getText() + "/");
    }

    public void pomnozi(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%") &&
                !poljeTeksta.getText().endsWith("/") && !poljeTeksta.getText().endsWith("X") &&
                !poljeTeksta.getText().endsWith("-") && !poljeTeksta.getText().endsWith("+") &&
                        !poljeTeksta.getText().equals("")
                && !poljeTeksta.getText().endsWith("."))
        poljeTeksta.setText(poljeTeksta.getText() + "X");
    }

    public void oduzmi(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%") &&
                !poljeTeksta.getText().endsWith("/") && !poljeTeksta.getText().endsWith("X") &&
                !poljeTeksta.getText().endsWith("-") && !poljeTeksta.getText().endsWith("+")
                && !poljeTeksta.getText().endsWith("."))
        poljeTeksta.setText(poljeTeksta.getText() + "-");
    }


    public void dodaj(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%") &&
                !poljeTeksta.getText().endsWith("/") && !poljeTeksta.getText().endsWith("X") &&
                        !poljeTeksta.getText().endsWith("-") && !poljeTeksta.getText().endsWith("+")
                && !poljeTeksta.getText().endsWith("."))
            poljeTeksta.setText(poljeTeksta.getText() + "+");
    }

    public void jednakost(ActionEvent actionEvent) {
        String s = poljeTeksta.getText();

    }
    public void broj7(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "7");
    }

    public void broj8(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "8");
    }

    public void broj9(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "9");
    }

    public void broj0(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "0");
    }

    public void broj3(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "3");
    }

    public void broj2(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "2");
    }

    public void broj1(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "1");
    }

    public void broj6(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "6");
    }

    public void broj5(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "5");
    }

    public void broj4(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%"))
        poljeTeksta.setText(poljeTeksta.getText() + "4");
    }

    public void tocka(ActionEvent actionEvent) {
        if(!poljeTeksta.getText().endsWith("%") &&
                !poljeTeksta.getText().endsWith("/") && !poljeTeksta.getText().endsWith("X") &&
                !poljeTeksta.getText().endsWith("-") && !poljeTeksta.getText().endsWith("+")
        && !poljeTeksta.getText().endsWith(".") && !poljeTeksta.getText().equals(""))
            poljeTeksta.setText(poljeTeksta.getText() + ".");

    }
}
