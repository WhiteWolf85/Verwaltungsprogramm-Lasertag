import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

/**
 * Created by Tobi on 21.06.2016.
 */
public class SpielerController {

    @FXML
    ListView<String> PlayerList;
    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    Label label3;
    @FXML
    Label label4;
    @FXML
    Label label5;
    @FXML
    Label label6;
    @FXML
    Label label7;
    @FXML
    Label label8;




    public void initialize(){

        Spieler Tobias = new Spieler("Tobias", 19, "Bankhocker", null, null, "verletzt");
        Spieler Anna = new Spieler("Anna", 20, "Bloody Mary", null, "Runner", "aktiv");
        Spieler Tom = new Spieler("Tom", 20, "Reitermaniac", null, "Runner", "aktiv");
        Spieler Franz = new Spieler("Franz", 30, "White Wolf", null, "Mittelfeld", "aktiv");


        ObservableList<String> playerNames=FXCollections.observableArrayList();
        for(Spieler val:Main.globalPlayers){
            playerNames.add(val.getNickName());
        }

        PlayerList.setItems(playerNames);
    }


    public void reactToButtonClick(ActionEvent Event){
/*
        label1.setText(PlayerList.);
        label2.setText();
        label3.setText();
        label4.setText();
        label5.setText();
        label6.setText();
        label7.setText();
        label8.setText();
   */
    }
}
