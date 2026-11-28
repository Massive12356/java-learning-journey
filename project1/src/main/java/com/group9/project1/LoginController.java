package com.group9.project1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;


public class LoginController {

    // Connects this Label to the Label defined in the FXML file.
    @FXML
    private Label welcomeText;

    // This method runs when the Hello button is clicked.
    @FXML
    protected void onHelloButtonClick() {

        // Changes the text displayed inside the welcomeText Label.
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    // This method handles the Sign-Up hyperlink click event.
    @FXML
    private void handleSignUp(ActionEvent event) throws IOException {

        // Loads the registration page from the register.fxml file.
        // Parent represents the root container of the new interface.
        Parent root = FXMLLoader.load(
                getClass().getResource("register.fxml")
        );

        // Get the current application window when clicked on the hyperlink

         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Creates a new Scene using the registration page layout
        // and replaces the current login page with it.
        stage.setScene(new Scene(root));
        stage.setTitle("Registration Page");
    }

}


