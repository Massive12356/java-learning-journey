package com.group9.project1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;

public class RegisterController {

@FXML
    private void handleLogin(ActionEvent event)  throws IOException {
        // Load the LOGIN PAGE
    Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

    // get the current appliaction window
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

    // Display the login page in current window
    stage.setScene(new Scene(root));
    }
}