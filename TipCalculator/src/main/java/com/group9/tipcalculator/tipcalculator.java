package com.group9.tipcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class tipcalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("tipview.fxml"));
       Scene scene = new Scene(root);
       primaryStage.setTitle("Tip Calculator");
       primaryStage.setScene(scene);
         primaryStage.show();
    }
}
