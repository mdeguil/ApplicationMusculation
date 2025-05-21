package fr.application.muscu.View;

import javafx.application.Application;
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
    @Override
    public void start(Stage stage) throws IOException {
        // Créer un BorderPane
        BorderPane borderPane = new BorderPane();

        final double PHONE_WIDTH = 375;
        final double PHONE_HEIGHT = 667;
        // Créer une Scene avec le BorderPane comme nœud racine
        Scene scene = new Scene(borderPane, PHONE_WIDTH , PHONE_HEIGHT );

        // Créer l'entete de l'écrant d'accueil
        VBox entete = new VBox();
        Label titreApplication = new Label("Application de Musculation");
        entete.getChildren().addAll(titreApplication);

        entete.setAlignment(Pos.CENTER);
        borderPane.setTop(entete);

        VBox corp = new VBox();
        corp.setAlignment(Pos.CENTER);
        corp.setSpacing(20);
        Label choixProgramme = new Label("Choisir un programme :");
        ComboBox comboBoxProgramme = new ComboBox();
        Label choixSeance = new Label("Choisir une séance :");
        ComboBox comboBoxSeance = new ComboBox();
        Button btValider = new Button("Lancer la Séance !");

        corp.getChildren().addAll(choixProgramme, comboBoxProgramme, choixSeance, comboBoxSeance, btValider);

        borderPane.setCenter(corp);
        // Configurer la Fenêtre
        stage.setResizable(false);
        stage.setTitle("Application Mobile de Muscu");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
