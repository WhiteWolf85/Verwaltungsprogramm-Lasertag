import javafx.scene.image.*;
import javafx.scene.image.Image;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by Thomas Laptop on 20.06.2016.
 */

/**
 * @author Thomas
 */
public class TeamTest {

    Team team1;

    Spieler s1;
    Spieler s2;
    Spieler s3;
    Spieler s4;
    Spieler s5;
    Spieler s6;


    @Before
    public void startTest(){

        Main.setGlobalValues();

        team1 = new Team("Beamoforce One");

        s1=new Spieler("Anna",25,"BloodyMary","Angriff","aktiv");
        s2=new Spieler("Franz",30,"WhiteWolf","Mittelfeld","aktiv");
        s3=new Spieler("Tom",20,"Reitermaniac","Angriff","aktiv");
        s4=new Spieler("Martin",28,"Unreality","Angriff","aktiv");
        s5=new Spieler("Werner",35,"Horsti","Mittelfeld","aktiv");
        s6=new Spieler("Chris",23,"GreyWarden","Verteidigung","aktiv");

        team1.addToTeam(s1);
        team1.addToTeam(s2);
        team1.addToTeam(s3);
        team1.addToTeam(s4);
        team1.addToTeam(s5);
        team1.addToTeam(s6);

        s1.updateScore(180);       //Score: 65
        s2.updateScore(120);       //Score: 42
        s3.updateScore(100);       //Score: 43
        s4.updateScore(50);      //Score: 87
        s5.updateScore(50);       //Score: 71
        s6.updateScore(100);      //Score: 18
                                        //SumScore: 326
        s1.getScore();
        s2.getScore();
        s3.getScore();
        s4.getScore();
        s5.getScore();
        s6.getScore();

    }

    @Test
    public void testAddToTeam() throws Exception {
        assertEquals("Erwartet Reitermaniac",team1.getSpieler()[0],s1);
        assertEquals("Erwartet White Wholf",team1.getSpieler()[1],s2);
        assertEquals("Erwartet Bloody Mary", team1.getSpieler()[2],s3);
        assertEquals("Erwartet Sonic", team1.getSpieler()[3],s4);
        assertEquals("Erwartet HotShotGG", team1.getSpieler()[4],s5);
        assertEquals("Erwartet Cornisier", team1.getSpieler()[5],s6);
        assertEquals("Spieleranzahl = 6",team1.getTeamMember(),6);
    }

    @Test
    public void testRemoveFromTeam() throws Exception {
        team1.removeFromTeam(s1, team1);
        team1.removeFromTeam(s4, team1);
        assertEquals("Anzahl Teammitglieder = 4",team1.getTeamMember(),4);
        assertEquals("Anzahl Teamlose Spieler = 2", team1.teamloseSpieler.size(),2);
        assertEquals("Erwartet Reitermaniac", team1.teamloseSpieler.get(0),s1);
        assertEquals("Erwartet Sonic", team1.teamloseSpieler.get(1),s4);
    }

    @Test
    public void testRemoveTeam() throws Exception {
        team1.removeTeam(team1);
        assertEquals("Team gelöscht",team1.getTeamMember(),0);
        assertEquals("Teamlose Spieler = 6", team1.teamloseSpieler.size(), 6);
    }

    @Test
    public void testSumScore() throws Exception {
        /*Spieler[] players = new Spieler[6];
        for (int i = 0; i < players.length; i++){
            players[i] = team1.getSpieler()[i];
        }*/
        team1.sumScore();
        assertEquals("Score = 500", team1.getTeamScore(),326);
    }

    @Test
    public void testGamesPlayed() throws Exception {
        //Simulation für 3 gespielte Spiele
        for (int i = 0; i < 3; i++){
            team1.gamesPlayed(team1);
        }
        assertEquals("Erwartet: 3", team1.getGameCounter(),3);
    }
}