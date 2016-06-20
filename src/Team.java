import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.applet.*;
import java.util.List;

import static sun.applet.AppletResourceLoader.getImage;

/**
 * Created by Thomas Laptop on 12.05.2016.
 */

public class Team implements TeamInterface, Sortable {

    //Attribute
    private String teamName;
    private long teamScore;
    private int gameCounter;
    private int teamMember;
    private Team team;
    private Image teamLogo;
    private static int teamCounter = 0;


    //Array von der Klasse Spieler, um die Teammitglieder einzulesen    //Anm. ArrayList wäre besser
    ArrayList<Spieler> spieler=new ArrayList<Spieler>();


    //Team für Spieler ohne Team
    //Muss in main, da in der Klasse keine Funktion
    //Team teamlos;

    //Im Konstruktor wird der Name des Teams eingelesen?
    public Team(String teamName) {
        this.teamName = teamName;
        this.teamScore = 0;
        this.gameCounter = 0;
        this.teamMember = 0;
        Main.globalTeams.add(this);
        teamCounter++;
    }

    //toString Methode, um die Attribute mit Wert anzuzeigen
    @Override
    public String toString() {
        return "Team: " + teamName + "\n" +
                "Score: " + teamScore + "\n" +
                "Games played: " + gameCounter;
    }

    //Fügt ein Team hinzu
    /*public void addTeam() {
        Team team = new Team();
        Scanner scanner = new Scanner(System.in);
        team.teamName = scanner.nextLine();
        team.teamImage(teamLogo);
    }*/

    //Entfernt ein Team und fügt die Spieler einer Arraylist hinzu, die alle Spieler sammelt, die "Teamlos" sind
    public void removeTeam(Team team) {
        List<Spieler> teamloseSpieler = new ArrayList<Spieler>();
        for (int i = 0; i < team.teamMember; i++) {
            //teamlos.spieler[teamlos.teamMember + 1] = team.spieler[i];
            //teamlos.teamMember++;
            //teamloseSpieler.add(team.spieler[i]);
            team.teamMember--;
        }
        if (team.teamMember == 0) {
            team = null;
        }
    }

    //Fügt Spieler an ein Team an
    public void addToTeam(Spieler spieler) {
        this.teamMember++;
        this.spieler.add(spieler);
    }

    //Summiert den Score der einzelnen Spieler des Teams für das jeweilige Spiel auf
    public long sumScore(Spieler[] spieler) {
        //For Schleife für 6 Westen
        for (int i = 0; i <= 5; i++) {
            this.teamScore += spieler[i].getScore();
        }
        return this.teamScore;
    }

    public Image teamImage(Image teamLogo) {
        Image image = teamLogo;
        return image;
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

    public long getScore(){return this.teamScore;}

    public int getGameCounter() {
        return this.gameCounter;
    }

    public int getTeamMember() {
        return this.teamMember;
    }

    public Team getTeam() {
        return this.team;
    }

    public int getTeamCounter() {
        return teamCounter;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
