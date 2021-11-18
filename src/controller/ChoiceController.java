package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.staticinfo;

import java.io.File;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class ChoiceController implements Initializable {
    @FXML
    private AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }




    @FXML
    private void con_sal(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../view/mainView.fxml"));
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        currentStage.setTitle("Make New Account");
        currentStage.setScene(scene);
        currentStage.show();
    }
    @FXML
    private void con_vip(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../view/mainViewVip.fxml"));
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        currentStage.setTitle("Make New Account");
        currentStage.setScene(scene);
        currentStage.show();
    }
    @FXML
    private void con_ep(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../view/mainViewep.fxml"));
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        currentStage.setTitle("Make New Account");
        currentStage.setScene(scene);
        currentStage.show();
    }
}

