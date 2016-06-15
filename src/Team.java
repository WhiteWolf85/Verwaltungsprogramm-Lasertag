import javax.imageio.ImageIO;
import java.awt.*;
import java.util.Scanner;
import java.applet.*;

import static sun.applet.AppletResourceLoader.getImage;

/**
 * Created by Thomas Laptop on 12.05.2016.
 */

public class Team implements TeamInterface {

    //Attribute
    private String teamName;
    private long teamScore;
    private int gameCounter;
    private int teamMember;
    private Team team;
    private Image teamLogo;


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

    public void addTeam() {
        Team team = new Team();
        Scanner scanner = new Scanner(System.in);
        team.teamName = scanner.nextLine();
        team.teamImage(teamLogo);
    }

    public void removeTeam(Team team) {
        for (int i = 0; i < teamMember; i++) {
            teamlos.spieler[teamlos.teamMember + 1] = team.spieler[i];
            teamlos.teamMember++;
        }
        if (team.teamMember == 0) {
            team = null;
        }
    }

    //Fügt Spieler an ein Team an
    public void addToTeam(Spieler spieler, Team team) {
        team.teamMember++;
        team.spieler[team.teamMember] = spieler;
    }

    public long sumScore(Spieler[] spieler) {
        for (int i = 0; i <= 5; i++) {
            this.teamScore += spieler[i].getScore();
        }
        return this.teamScore;
    }

    public void teamImage(Image teamLogo) {
        team.teamLogo = teamLogo;
    }

    //Anzahl der Gespielten Spiele des jeweiligen Teams
    public int gamesPlayed(Team team) {
        return team.gameCounter++;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public long getTeamScore() {
        return this.teamScore;
    }

    public int getGameCounter() {
        return this.gameCounter;
    }

    public int getTeamMember() {
        return this.teamMember;
    }

    public Team getTeam() {
        return this.team;
    }


    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
