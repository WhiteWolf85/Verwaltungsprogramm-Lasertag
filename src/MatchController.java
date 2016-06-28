import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javax.swing.*;
import java.util.Random;

/**
 * Created by franz on 20.05.16.
 */
public class MatchController{

    @FXML
    private ChoiceBox team1,team2;
    @FXML
    private Label resultTeam1,resultTeam2,detailResultTeam1,detailResultTeam2,games;

    private static int playedMatches;

    public void initialize(){

        //Initiiere GameCounter und fülle DropDown-Felder
        games.setText(Integer.toString(playedMatches));
        this.fillDropDown(null,null);


    }

    private void fillDropDown(Team previous1,Team previous2){
        
        team1.getItems().clear();
        team2.getItems().clear();
        team1.setItems(FXCollections.observableArrayList(Main.globalTeams));
        team2.setItems(FXCollections.observableArrayList(Main.globalTeams));

        //Falls DropDown-Felder vorher schon gefüllt waren
        if(previous1!=null) {
            team1.getSelectionModel().select(previous1);
            team2.getSelectionModel().select(previous2);
        }
    }

    public void startGame(ActionEvent event){

        Team team1=(Team)this.team1.getValue();
        Team team2=(Team)this.team2.getValue();

        //Leere Labels
        resultTeam1.setText("");
        resultTeam2.setText("");
        detailResultTeam1.setText("");
        detailResultTeam2.setText("");

        if(!team1.equals(team2)){
                playedMatches++;
                Random r=new Random();
                int vestScore=0;
                int result=0;
                int vestCount=0;
                Spieler[] spieler=team1.getSpieler();
                Vest vest;

                for(int i=0;i<spieler.length;i++){
                    vest=Main.globalVests.get(vestCount);
                    vest.randomHits();
                    vest.randomHitsby();
                    vest.calculateScore();
                    vest.calculateRatio();
                    vestScore=vest.getScore();
                    detailResultTeam1.setText(detailResultTeam1.getText()+vestScore+"\t\t"+spieler[i].getNickName()+"\n");
                    spieler[i].updateScore(vestScore);
                    result+=vestScore;
                    vestCount++;
                }
                resultTeam1.setText(Integer.toString(result));
                team1.sumScore(result);
                result=0;

                spieler=team2.getSpieler();

                for(int i=0;i<spieler.length;i++){
                    vest=Main.globalVests.get(vestCount);
                    vest.randomHits();
                    vest.randomHitsby();
                    vest.calculateScore();
                    vest.calculateRatio();
                    vestScore=vest.getScore();
                    detailResultTeam2.setText(detailResultTeam2.getText()+vestScore+"\t\t"+spieler[i].getNickName()+"\n");
                    spieler[i].updateScore(vestScore);
                    result+=vestScore;
                    vestCount++;
                }
                resultTeam2.setText(Integer.toString(result));
                team2.sumScore(result);
                games.setText(Integer.toString(playedMatches));
            this.fillDropDown(team1,team2);
        }else{
            //gleiches Team ausgewählt
            JOptionPane.showMessageDialog(null, team1.getTeamName() + " spielt gegen sich selbst\nSpieler sind verwirrt -> Spielabbruch","Gleiches Team gewählt", JOptionPane.ERROR_MESSAGE);
        }
    }

}






