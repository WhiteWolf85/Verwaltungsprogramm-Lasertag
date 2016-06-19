import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    @FXML
    private AnchorPane content;





    public void showMatch(ActionEvent event) throws IOException {

        Node node = (Node)FXMLLoader.load(getClass().getResource("match.fxml"));
        content.getChildren().setAll(node);
    }

    public void showVest(ActionEvent event) throws IOException {

        Node node = (Node)FXMLLoader.load(getClass().getResource("vest.fxml"));
        content.getChildren().setAll(node);
    }

    public void showPlayer(ActionEvent event) throws IOException {

        Node node = (Node)FXMLLoader.load(getClass().getResource("SpielerGUI.fxml"));
        content.getChildren().setAll(node);
    }

    public void showTeam(ActionEvent event) throws IOException {

        Node node = (Node)FXMLLoader.load(getClass().getResource("team.fxml"));
        content.getChildren().setAll(node);
    }

    public void showList(ActionEvent event) throws IOException {

        Node node = (Node)FXMLLoader.load(getClass().getResource("list.fxml"));
        content.getChildren().setAll(node);
        ListController listController=new ListController();
        listController.fillList();
    }

}
