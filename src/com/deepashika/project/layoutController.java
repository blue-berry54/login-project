package com.deepashika.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
//import javafx.stage.Stage;
import javafx.scene.media.AudioClip;
import java.net.URL;



public class layoutController {

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
    
    @FXML
    private AudioClip clickSound;
    
    @FXML
    public void initialize() {
        // Load the sound file from the same package as the controller
        URL soundURL = getClass().getResource("click_sound.wav");
        if (soundURL != null) {
            clickSound = new AudioClip(soundURL.toString());
        } else {
            System.err.println("click_sound.wav not found!");
        }

        // Play sound on click for each control
        loginButton.setOnMouseClicked(e -> playClickSound());
        username.setOnMouseClicked(e -> playClickSound());
        password.setOnMouseClicked(e -> playClickSound());
    }

    // Add this helper:
    private void playClickSound() {
        if (clickSound != null) {
            clickSound.play();
        }
    }


    @FXML
    void loginBtn(ActionEvent event) {
        String user = username.getText();
        String pass = password.getText();
        
        if ("admin".equals(user) && "1234".equals(pass)) {
            
            // here should be integration logic
            
        }
    }

    @FXML
    void passwordString(ActionEvent event) {
        
    }

    @FXML
    void usernameString(ActionEvent event) {
        
    }

}
