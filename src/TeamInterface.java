import java.awt.*;

/**
 * Created by Thomas Laptop on 13.05.2016.
 */
interface TeamInterface {

    //Methoden
    void Team(String teamName);
    long sumScore(Spieler[] spieler);
    void addTeam();
    void removeTeam(Team team);
    void addToTeam(Spieler spieler, Team team);
    int gamesPlayed(Team team);
    String toString();
    Image teamImage(Image teamLogo);

    //Getter
    String getTeamName();
    long getTeamScore();
    int getGameCounter();
    int getTeamMember();
    Team getTeam();
    int getTeamCounter();

    //Setter
    void setTeamName(String teamName);
    void setTeam(Team team);
}

