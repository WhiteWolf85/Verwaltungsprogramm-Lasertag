import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

/**
 * Created by Tobi on 21.06.2016.
 */
public class SpielerController {

@FXML
ListView<String> PlayerList;

    public void initialize(){

        Spieler Tobias = new Spieler("Tobias", 19, "Tobi", null, null, "verletzt");
        Spieler Anna = new Spieler("Anna", 20, "Bloody Mary", null, "Runner", "aktiv");
        Spieler Tom = new Spieler("Tom", 20, "Reitermaniac", null, "Runner", "aktiv");
        Spieler Franz = new Spieler("Franz", 30, "White Wolf", null, "Mittelfeld", "aktiv");


        ObservableList<String> playerNames=FXCollections.observableArrayList();
        for(Spieler val:Main.globalPlayers){
            playerNames.add(val.nickName);
        }

        PlayerList.setItems(playerNames);

    }



}
