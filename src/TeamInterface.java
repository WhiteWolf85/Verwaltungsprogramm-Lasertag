import sun.security.provider.ConfigFile;

/**
 * Created by Thomas Laptop on 13.05.2016.
 */
interface TeamInterface {

    //Methoden
    long sumScore(Spieler[] spieler);
    void addTeam();
    void removeTeam(Team team);
    void addToTeam(Spieler spieler, Team team);
    int gamesPlayed(Team team);
    String toString();
    void teamImage();

    //Getter
    String getTeamName();
    long getTeamScore();
    int getGameCounter();
    int getTeamMember();
    Team getTeam();

    //Setter
    void setTeamName(String teamName);
    void setTeam(Team team);
}

