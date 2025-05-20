package fr.application.muscu.View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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
