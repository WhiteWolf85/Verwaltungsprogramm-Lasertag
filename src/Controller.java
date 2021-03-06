import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.net.URL;

public class Controller {

    @FXML
    private AnchorPane content;

    //Lade entsprechende .fxml in die Center der BorderPane

    public void showMatch(ActionEvent event) throws IOException {
        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("match.fxml");
        BorderPane list = FXMLLoader.load( listLink );

        root.setCenter(list);
    }

    public void showVest(ActionEvent event) throws IOException {

        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("vest.fxml");
        BorderPane list = FXMLLoader.load( listLink );

        root.setCenter(list);
    }

    public void showPlayer(ActionEvent event) throws IOException {

        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("SpielerGUI.fxml");
        BorderPane list = FXMLLoader.load( listLink );

        root.setCenter(list);

    }

    public void showTeam(ActionEvent event) throws IOException {
        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("team.fxml");
        BorderPane list = FXMLLoader.load( listLink );

        root.setCenter(list);
    }

    public void showList(ActionEvent event) throws IOException {

        BorderPane root=Main.getRoot();
        URL listLink = getClass().getResource("list.fxml");
        BorderPane list = FXMLLoader.load( listLink );

        root.setCenter(list);


    }

}
