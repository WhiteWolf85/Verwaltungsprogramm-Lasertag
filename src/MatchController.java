import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by franz on 20.05.16.
 */
public class MatchController{

    @FXML
    private ChoiceBox team1;
    @FXML
    private ChoiceBox team2;
    @FXML
    private Label resultTeam1;
    @FXML
    private Label resultTeam2;
    @FXML
    private Label detailResultTeam1;
    @FXML
    private Label detailResultTeam2;
    @FXML
    private Label games;

    private static int playedMatches;

    public void initialize(){

        games.setText(Integer.toString(playedMatches));

        team1.setItems(FXCollections.observableArrayList(Main.globalTeams));
        team2.setItems(FXCollections.observableArrayList(Main.globalTeams));

    }

    public void startGame(ActionEvent event){
/*
        //Testwerte
        Team beamforce=(Team)team1.getValue();
        Team btb=(Team)team2.getValue();
        //Vest v1=new Vest();
        //Main.globalVests.add(v1);
        //Vest v2=new Vest();
        //Main.globalVests.add(v2);
        //Vest v3=new Vest();
        //Main.globalVests.add(v3);
        //Vest v4=new Vest();
        //Main.globalVests.add(v4);
        Spieler s1=new Spieler();
        //s1.nickName="WhiteWolf";
        Spieler s2=new Spieler();
        //s2.nickName="BloodyMary";
        Spieler s3=new Spieler();
        //s3.nickName="PG";
        Spieler s4=new Spieler();
        //s4.nickName="Tine";
        beamforce.addToTeam(s1);
        beamforce.addToTeam(s2);
        btb.addToTeam(s3);
        btb.addToTeam(s4);



        //Ende Testwerte
*/
        Team team1=(Team)this.team1.getValue();
        Team team2=(Team)this.team2.getValue();

        resultTeam1.setText("");
        resultTeam2.setText("");
        detailResultTeam1.setText("");
        detailResultTeam2.setText("");

        if(!team1.equals(team2)){
            int gesamt=team1.getTeamMember()+team2.getTeamMember();
            if(gesamt<=Main.globalVests.size()){
                playedMatches++;
                Random r=new Random();
                int playerScore=0;
                int vestCount=0;
                int result=0;

                for(Spieler player:team1.getSpieler()){
                    //hier müsste eigentlich eine Methode der Klasse Vest aufgerufen werden, die den Score des aktuellen Spiels zurückgibt
                    playerScore=r.nextInt(900) - 450;
                    detailResultTeam1.setText(detailResultTeam1.getText()+playerScore+"\t\t"+player.getNickName()+"\n");
                    result+=playerScore;
                    vestCount++;   //wird benötigt, um bei Team 2 mit der richtigen Weste weiter zu machen
                }
                resultTeam1.setText(Integer.toString(result));
                result=0;

                for(Spieler player:team2.getSpieler()){
                    //hier müsste eigentlich eine Methode der Klasse Vest aufgerufen werden, die den Score des aktuellen Spiels zurückgibt
                    playerScore=r.nextInt(900) - 450;
                    result+=playerScore;
                    detailResultTeam2.setText(detailResultTeam2.getText()+playerScore+"\t\t"+player.getNickName()+"\n");
                }
                resultTeam2.setText(Integer.toString(result));

                games.setText(Integer.toString(playedMatches));

            }else{
                //Mehr Spieler als Westen
            }
        }else{
            //gleiches Team ausgewählt
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






