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


public class AppController implements Initializable {
    @FXML
    private AnchorPane mino;

    @FXML
    private JFXTextField user;
    @FXML
    private JFXPasswordField passw;
    @FXML
    private Label lbl;
    @FXML
    private ImageView bgv;

    @FXML
    private ImageView psv;

    String USERNAME = "bechir";
    String PASSWORD = "1234";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File bb=new File("../bank.jpg");
        Image bg=new Image(bb.toURI().toString());
        bgv.setImage(bg);

        File lf=new File("../pa.png");
        Image lv=new Image(lf.toURI().toString());
        psv.setImage(lv);

    }


    @FXML
    private void control_login(ActionEvent event) throws IOException {
        staticinfo.USERNAME = user.getText();
        if (user.getText().equals(USERNAME) && passw.getText().equals(PASSWORD)) {
            Parent root = FXMLLoader.load(getClass().getResource("../view/choice.fxml"));
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            currentStage.setTitle("Make New Account");
            currentStage.setScene(scene);
            currentStage.show();
        } else {
            lbl.setText("Invalid Username or Password.");
        }
    }





    @FXML
    private void control_cancel(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "contact with administrator 03156897944");
    }


}
