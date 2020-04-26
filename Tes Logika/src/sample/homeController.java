package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class homeController extends dataController {

    @FXML
    private Button goSoal1;
    @FXML
    private TextField name;

    @FXML
    private void goSoal1Action(ActionEvent event) {
        nama = name.getText();
        System.out.println(nama);
        Node source = (Node) event.getSource();
        Stage stage = (Stage)  source.getScene().getWindow();
        stage.close();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("soal1.fxml"));
            Parent root = loader.load();
            Stage stage1 = new Stage();
            stage1.setTitle("Tes Logika");
            stage1.setScene(new Scene(root));
            stage1.show();
        } catch (IOException e) {
            System.err.println(e);
            System.out.println("error saat change stages");
        }
    }
}
