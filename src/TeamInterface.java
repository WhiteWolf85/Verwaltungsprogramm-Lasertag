import sun.security.provider.ConfigFile;

/**
 * Created by Thomas Laptop on 13.05.2016.
 */
interface TeamInterface {

    //Methoden
    long sumScore(Spieler[] spieler);
    void addTeam(Team team);
    void removeTeam(Team team);
    void addToTeam(Spieler spieler);
    int gamesPlayed(Team team);
    String toString();
    void teamImage();

    //Getter
    String getTeamName();
    long getTeamScore();
    int getGameCounter();
    int getTeamMember();

    //Setter
    void setTeamName(String teamName);
}

