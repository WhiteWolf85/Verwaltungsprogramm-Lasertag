import javafx.scene.image.ImageView;

import java.awt.*;

/**
 * Created by Thomas Laptop on 13.05.2016.
 */
interface TeamInterface {

    //Methoden
    long sumScore(Spieler[] spieler);
    //void addTeam();
    void removeTeam(Team team);
    void addToTeam(Spieler spieler, Team team);
    void removeFromTeam(Spieler spieler, Team team);
    int gamesPlayed(Team team);
    String toString();
    ImageView teamImage(ImageView teamLogo);

    //Getter
    String getTeamName();
    long getTeamScore();
    int getGameCounter();
    int getTeamMember();
    Team getTeam();
    int getTeamCounter();
    ImageView getTeamLogo();

    //Setter
    void setTeamName(String teamName);
    void setTeam(Team team);
    void setTeamLogo(ImageView teamLogo);
}

