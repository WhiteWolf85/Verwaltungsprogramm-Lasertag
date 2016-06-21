import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sun.security.provider.ConfigFile;

import java.util.ArrayList;

/**
 * Created by franz on 19.06.16.
 */
public class TeamController {
    @FXML
    ListView<String> teamList;

    @FXML
    Label teamName;
    @FXML
    ListView players;
    @FXML
    Label teamScore;

    //Testwerte
    Team team1 = new Team("Beamforce One");
    Team team2 = new Team("Red Arrows");

    Spieler reitermaniac = new Spieler("Thomas",21,"Reitermaniac",team1,"Runner","aktiv"); //String name, int age, String nickName, Team team, String role, String status
    Spieler whiteWolf = new Spieler("Franz",30,"White Wolf", team1, "Mittelfeld","aktiv");
    Spieler bloodyMary = new Spieler("Anna",25,"Boody Mary",team1,"Runner","aktiv");
    Spieler sonic = new Spieler("Max", 23,"Sonic",team1,"Runner","aktiv");
    Spieler hotShotGG = new Spieler("Tobi",23,"HotShotGG",team1,"Rampensau","aktiv");
    Spieler cornisier = new Spieler("Chris",22,"Cornisier",team1,"Rechts","aktiv");

    Spieler s1 = new Spieler("Ralf",20,"Blubb",team2,"Mittelfeld","aktiv");
    Spieler s2 = new Spieler("Martin",25,"Commander",team2,"Links","aktiv");
    Spieler s3 = new Spieler("Patrick",22,"Banane",team2,"Rechts","aktiv");
    Spieler s4 = new Spieler("David", 20, "Frenchguy", team2, "Defensive", "aktiv");
    Spieler s5 = new Spieler("Andi",19,"Apfel", team2, "Runner", "aktiv");
    Spieler s6 = new Spieler("Bernd", 30, "Berni", team2, "Runner", "aktiv");

    public void initialize(){
        ObservableList<String> teamNames= FXCollections.observableArrayList();
        for(Team val:Main.globalTeams){
            teamNames.add(val.getTeamName());
        }

        teamList.setItems(teamNames);
        add();
    }

    public void add(){
        team1.addToTeam(reitermaniac);
        team1.addToTeam(whiteWolf);
        team1.addToTeam(bloodyMary);
        team1.addToTeam(sonic);
        team1.addToTeam(hotShotGG);
        team1.addToTeam(cornisier);

        team2.addToTeam(s1);
        team2.addToTeam(s2);
        team2.addToTeam(s3);
        team2.addToTeam(s4);
        team2.addToTeam(s5);
        team2.addToTeam(s6);
    }

    public void showDetails(){
        String result = teamList.getSelectionModel().getSelectedItem();
        for(Team val:Main.globalTeams){
            if(val.getTeamName().equals(result)){
                teamName.setText(val.getTeamName());
                teamScore.setText(String.valueOf(val.getScore()));
                Spieler[] player = val.getSpieler();
                ArrayList<String> liste = new ArrayList<String>();
                for(Spieler vel: player) {
                    liste.add(vel.getNickName());
                }
                players.setItems(FXCollections.observableArrayList(liste));
            }
        }
    }

}