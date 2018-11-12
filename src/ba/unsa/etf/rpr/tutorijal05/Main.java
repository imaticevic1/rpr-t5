package ba.unsa.etf.rpr.tutorijal05;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("digitron.fxml"));
        GridPane mreza = new GridPane();
        mreza.setVgap(10);
        mreza.setHgap(30);
        mreza.setPadding(new Insets(10));
        mreza.setAlignment(Pos.CENTER);
        TextField poljeTeksta = new TextField();
        poljeTeksta.setEditable(false);
        Button posto = new Button("%");
        Button podeljeno = new Button("/");
        Button mnozejne = new Button ("*");
        Button oduzimanje = new Button("-");
        Button broj7 = new Button("7");
        Button broj8 = new Button("8");
        Button broj9 = new Button("9");
        Button broj4 = new Button("4");
        Button broj5 = new Button("5");
        Button broj6 = new Button("6");
        Button broj1 = new Button("1");
        Button broj2 = new Button("2");
        Button broj3 = new Button("3");
        Button zbrajanje = new Button("+");
        Button jednako = new Button("=");
        Button nula = new Button ("0");
        Button tocka = new Button (".");
        zbrajanje.setPrefHeight(70);
        jednako.setPrefHeight(70);
        nula.setPrefWidth(75);
        mreza.add(poljeTeksta,0,0, 4, 1);
       mreza.add(posto,0,1,1,1);
        mreza.add(podeljeno,1,1,1,1);
        mreza.add(mnozejne,2,1,1,1);
        mreza.add(oduzimanje,3,1,1,1);
        mreza.add(broj7,0,2,1,1);
        mreza.add(broj8,1,2,1,1);
        mreza.add(broj9,2,2,1,1);
        mreza.add(broj4,0,3,1,1);
        mreza.add(broj5,1,3,1,1);
        mreza.add(broj6,2,3,1,1);
        mreza.add(broj1,0,4,1,1);
        mreza.add(broj2,1,4,1,1);
        mreza.add(broj3,2,4,1,1);
        mreza.add(zbrajanje,3,2,1,2);
        mreza.add(jednako,3,4,1,2);
        mreza.add(nula,0,5,2,1);
        mreza.add(tocka,2,5,1,1);
        primaryStage.setTitle("digitron");
        Scene scene = new Scene(mreza,250,275);
        primaryStage.setScene(scene);
        primaryStage.show();
        GridPane.setConstraints(posto,0,1);
        GridPane.setConstraints(podeljeno,1,1);
        GridPane.setConstraints(mnozejne,2,1);
        GridPane.setConstraints(oduzimanje,3,1);
        GridPane.setConstraints(broj7,0,2);
        GridPane.setConstraints(broj8,1,2);
        GridPane.setConstraints(broj9,2,2);
        GridPane.setConstraints(broj4,0,3);
        GridPane.setConstraints(broj5,1,3);
        GridPane.setConstraints(broj6,2,3);
        GridPane.setConstraints(broj1,0,4);
        GridPane.setConstraints(broj2,1,4);
        GridPane.setConstraints(broj3,2,4);
        GridPane.setConstraints(zbrajanje,3,2);
        GridPane.setConstraints(jednako,3,4);
        GridPane.setConstraints(nula,0,5);
        GridPane.setConstraints(tocka,2,5);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
