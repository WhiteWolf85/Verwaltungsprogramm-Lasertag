import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;


/**
 * Created by Tobi on 21.06.2016.
 */
public class SpielerController {

    @FXML
    ListView<String> PlayerList;
    @FXML
    Label label0;
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

        ObservableList<String> playerNames=FXCollections.observableArrayList();
        for(Spieler val:Main.globalPlayers){
            playerNames.add(val.getNickName());
        }

        PlayerList.setItems(playerNames);
    }


    public void reactToButtonClick(ActionEvent Event){

        String result=PlayerList.getSelectionModel().getSelectedItem();
        for(Spieler val:Main.globalPlayers){
            if(result.equals(val.getNickName())){
                label0.setText(val.getName());
                label1.setText(Integer.toString(val.getAge()));
                label2.setText(val.getNickName());
                label3.setText(val.getTeam().getTeamName());
                //label4.setText(Integer.toString(val.getGames()));
                label5.setText(val.getRole());
                label6.setText(val.getStatus());
                label7.setText(Long.toString(val.getScore()));
                label8.setText(Float.toString(val.getRatio()));
            }
        }
    }
}
