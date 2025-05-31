package fr.application.muscu.View;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.Label;

import javax.swing.*;
import java.io.IOException;

public class MainJavaFX extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainJavaFX.class.getResource("/fr/application/muscu/Accueil.fxml"));
        final double PHONE_WIDTH = 375;
        final double PHONE_HEIGHT = 667;
        Scene scene = new Scene(loader.load(), PHONE_WIDTH, PHONE_HEIGHT);
        stage.setResizable(false);
        stage.setTitle("Application Mobile de Musculation");
        stage.setScene(scene);
        stage.show();
    }


}
