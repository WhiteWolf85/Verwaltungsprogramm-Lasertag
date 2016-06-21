import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
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
    }

    public void addImage(){
        //team 1 Teamlogo zuweisen
        ImageView teamLogo = new ImageView();
        teamLogo.setImage(new Image("../TeamLogos/BF.jpg"));
        team1.setTeamLogo(teamLogo);
        //team2 Teamlogo zuweisen
        ImageView teamLogo2 = new ImageView();
        teamLogo.setImage(new Image("../TeamLogos/Arrows.jpg"));
        team2.setTeamLogo(teamLogo2);
    }
}
