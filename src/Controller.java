import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class Controller {

    @FXML
    private AnchorPane content;



    public void showMatch(ActionEvent event) throws IOException {
        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("match.fxml");
        Pane list = FXMLLoader.load( listLink );

        root.setCenter(list);
    }

    public void showVest(ActionEvent event) throws IOException {

        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("list.fxml");
        Pane list = FXMLLoader.load( listLink );

        root.setCenter(list);
    }

    public void showPlayer(ActionEvent event) throws IOException {

        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("SpielerGUI.fxml");
        SplitPane list = FXMLLoader.load( listLink );

        root.setCenter(list);

    }

    public void showTeam(ActionEvent event) throws IOException {
        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("team.fxml");
        SplitPane list = FXMLLoader.load( listLink );

        root.setCenter(list);
    }

    public void showList(ActionEvent event) throws IOException {

        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("list.fxml");
        Pane list = FXMLLoader.load( listLink );

        root.setCenter(list);


    }

}
