import sun.security.provider.ConfigFile;

/**
 * Created by Thomas Laptop on 13.05.2016.
 */
interface TeamInterface {

    //Methoden
    double sumScore(Spieler spieler);
    void addTeam(Team team);
    void removeTeam(Team team);
    void addToTeam(Spieler spieler);
    int gamesPlayed(Team team);
    String toString();
    void teamImage();

    //Getter & Setter
    String getTeamName();
    int getTeamScore();
    int getGameCounter();
    int getTeamMember();

    void setTeamName(String teamName);
}

