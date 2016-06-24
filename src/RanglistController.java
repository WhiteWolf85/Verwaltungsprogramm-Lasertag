import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

/**
 * Created by franz on 19.06.16.
 */
public class RanglistController {

    @FXML
    private TableView listTeam, listPlayer;
    @FXML
    private TableColumn<Team,String> teamname, teamscore;
    @FXML
    private TableColumn<Spieler,String> player, playerScore;

    private Rangliste sort=new Rangliste();

    public void initialize(){
        this.fillList();
    }

    public void fillList(){

        ArrayList<Sortable> teamList=new ArrayList<Sortable>();
        for(Team var:Main.globalTeams){
            teamList.add(var);
        }

        ObservableList<? extends Sortable> ol= FXCollections.observableArrayList(sort.getSortedList(teamList));

        teamname.setCellValueFactory(new PropertyValueFactory<Team,String>("teamName"));
        teamscore.setCellValueFactory(new PropertyValueFactory<Team,String>("teamScore"));

        listTeam.setItems(ol);
    }

    public void getPlayers(){
        Team team=(Team)listTeam.getSelectionModel().getSelectedItem();
        Spieler[] players=team.getSpieler();

        ArrayList<Sortable> playerList=new ArrayList<Sortable>();

        for(Spieler var:players){
            playerList.add(var);
        }

        ObservableList<? extends Sortable> ol= FXCollections.observableArrayList(sort.getSortedList(playerList));

        player.setCellValueFactory(new PropertyValueFactory<Spieler,String>("nickName"));
        playerScore.setCellValueFactory(new PropertyValueFactory<Spieler,String>("score"));


        listPlayer.setItems(ol);
    }

    public void getAllPlayers(){

        ArrayList<Sortable> playerList=new ArrayList<Sortable>();
        for(Spieler var:Main.globalPlayers){
            playerList.add(var);
        }

        ObservableList<? extends Sortable> ol= FXCollections.observableArrayList(sort.getSortedList(playerList));

        //ObservableList<Spieler> ol= FXCollections.observableArrayList(Main.globalPlayers);
        player.setCellValueFactory(new PropertyValueFactory<Spieler,String>("nickName"));
        playerScore.setCellValueFactory(new PropertyValueFactory<Spieler,String>("score"));
        listPlayer.setItems(ol);
    }

}