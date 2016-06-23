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

    Spieler reitermaniac;
    Spieler whiteWolf;
    Spieler bloodyMary;
    Spieler sonic;
    Spieler hotShotGG;
    Spieler cornisier;


    @Before
    public void startTest(){

        Main.setGlobalValues();

        team1 = new Team("Beamoforce One");

        reitermaniac = new Spieler();
        whiteWolf = new Spieler();
        bloodyMary = new Spieler();
        sonic = new Spieler();
        hotShotGG = new Spieler();
        cornisier = new Spieler();

        team1.addToTeam(reitermaniac);
        team1.addToTeam(whiteWolf);
        team1.addToTeam(bloodyMary);
        team1.addToTeam(sonic);
        team1.addToTeam(hotShotGG);
        team1.addToTeam(cornisier);

        reitermaniac.updateScore(16,5); //Score: 65
        whiteWolf.updateScore(12,6);    //Score: 42
        bloodyMary.updateScore(14,9);   //Score: 43
        sonic.updateScore(27,16);       //Score: 87
        hotShotGG.updateScore(19,8);    //Score: 71
        cornisier.updateScore(12,14);   //Score: 18
                                        //SumScore: 326
        reitermaniac.getScore();
        whiteWolf.getScore();
        bloodyMary.getScore();
        sonic.getScore();
        hotShotGG.getScore();
        cornisier.getScore();

    }

    @Test
    public void testAddToTeam() throws Exception {
        assertEquals("Erwartet Reitermaniac",team1.getSpieler()[0],reitermaniac);
        assertEquals("Erwartet White Wholf",team1.getSpieler()[1],whiteWolf);
        assertEquals("Erwartet Bloody Mary", team1.getSpieler()[2],bloodyMary);
        assertEquals("Erwartet Sonic", team1.getSpieler()[3],sonic);
        assertEquals("Erwartet HotShotGG", team1.getSpieler()[4],hotShotGG);
        assertEquals("Erwartet Cornisier", team1.getSpieler()[5],cornisier);
        assertEquals("Spieleranzahl = 6",team1.getTeamMember(),6);
    }

    @Test
    public void testRemoveFromTeam() throws Exception {
        team1.removeFromTeam(reitermaniac, team1);
        team1.removeFromTeam(sonic, team1);
        assertEquals("Anzahl Teammitglieder = 4",team1.getTeamMember(),4);
        assertEquals("Anzahl Teamlose Spieler = 2", team1.teamloseSpieler.size(),2);
        assertEquals("Erwartet Reitermaniac", team1.teamloseSpieler.get(0),reitermaniac);
        assertEquals("Erwartet Sonic", team1.teamloseSpieler.get(1),sonic);
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
        assertEquals("Score = 326", team1.getTeamScore(),326);
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