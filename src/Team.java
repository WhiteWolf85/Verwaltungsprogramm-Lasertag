import java.util.Scanner;

/**
 * Created by Thomas Laptop on 12.05.2016.
 */

public class Team {

    //Attribute
    private String teamName;
    private double teamScore;
    private int gameCounter;
    private int teamMember;


    //Array von der Klasse Spieler, um die Teammitglieder einzulesen
    Spieler[] spieler;


    //Team für Spieler ohne Team
    Team teamlos;

    //Im Konstruktor wird der Name des Teams eingelesen?
    public void Team(String teamName) {
        this.teamName = teamName;
        this.teamScore = 0;
        this.gameCounter = 0;
        this.teamMember = 0;
    }

    //toString Methode, um die Attribute mit Wert anzuzeigen
    @Override
    public String toString() {
        return "Team: " + teamName + "\n" +
                "Score: " + teamScore + "\n" +
                "Games played: " + gameCounter;
    }

    public void addTeam(Team team){

    }

    public void removeTeam(Team team){
        for(int i =0;i<teamMember;i++){
            team.spieler[i] = teamlos.spieler[i];
        }
        if(team.teamMember == 0){
            team = null;
        }
    }

    //Fügt Spieler an ein Team an
    public void addToTeam(Spieler spieler){

    }

    public double sumScore(Spieler[] s) {
        for (int i = 0; i <= 5; i++) {
            this.teamScore += s[i].getScore();
        }
        return this.teamScore;
    }

    public void teamImage() {

    }

    //Anzahl der Gespielten Spiele des jeweiligen Teams
    public int gamesPlayed(Team t) {
        return t.gameCounter++;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public double getTeamScore() {
        return this.teamScore;
    }

    public int getGameCounter() {
        return this.gameCounter;
    }

    public int getTeamMember(){
        return this.teamMember;
    }


    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
