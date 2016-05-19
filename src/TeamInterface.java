/**
 * Created by Thomas Laptop on 13.05.2016.
 */
interface TeamInterface {

    //Methoden
    double sumScore(Spieler spieler);
    void addTeam(Team team);
    void removeTeam(Team team);
    int gamesPlayed(Team team);
    String toString();
    void teamImage();

    //Getter & Setter
    String getTeamName();
    int getTeamScore();
    int getGameCounter();

    void setTeamName(String teamName);
}

