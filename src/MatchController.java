import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 * Created by franz on 20.05.16.
 */
public class MatchController implements MatchInterface{

    @FXML
    private ChoiceBox team1;
    @FXML
    private ChoiceBox team2;
    @FXML
    private Label resultTeam1;
    @FXML
    private Label resultTeam2;
    @FXML
    private TableView detailResultTeam1;
    @FXML
    private TableView detailResultTeam2;

    private int playedMatches;

    public void initialize(){
        Team beamforce=new Team("Beamforce");
        Team btb=new Team("BTB");

        team1.setItems(FXCollections.observableArrayList(Main.globalTeams));
        team2.setItems(FXCollections.observableArrayList(Main.globalTeams));
    }

    public void startGame(ActionEvent event){
        Team team1=(Team)this.team1.getValue();
        Team team2=(Team)this.team2.getValue();

        if(!team1.equals(team2)){
            int gesamt=team1.getTeamMember()
        }else{

        }


/*        int hits;
        int hitsBy;

        if(spieler.length<=vest.length) {
            for(int i=0;i<spieler.length;i++) {
                hits=getResult();
                hitsBy=getResult();
                vest[i].setHits(hits);
                vest[i].setHitsby(hits);
                spieler[i].updateScore(hits,hitsBy);
            }
            this.playedMatches += 1;
        }
*/    }

    private int getResult(){
        int zufallszahl;
            zufallszahl = (int)(Math.random() * 50);
            return zufallszahl;
        }
    }







