import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.ArrayList;

/**
 * Created by franz on 19.06.16.
 */
public class TeamController {
    @FXML
    ListView<String> teamList;

    public void initialize(){
        ObservableList<String> playerNames= FXCollections.observableArrayList();
        for(Spieler val:Main.globalPlayers){
            playerNames.add(val.getNickName());
        }

        teamList.setItems(playerNames);
    }
}
