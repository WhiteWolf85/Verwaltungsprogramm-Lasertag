import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by franz on 18.06.16.
 */
public class RanglisteTest {

    Team beamforce;
    Team btb;
    Spieler whiteWolf;
    Spieler bloodyMary;
    Spieler reitermaniac;
    Spieler pg;
    Spieler tine;

    @Before
    public void startTest(){

        Main.setGlobalValues();

        beamforce = new Team("Beamforce");
        btb = new Team("BTB");
        whiteWolf = new Spieler("Franz",30,"WhiteWolf","Mittelfeld","aktiv");
        bloodyMary = new Spieler("Anna",20,"BloodyMary","Mittelfeld","aktiv");
        reitermaniac=new Spieler("Tom",20,"Reitermaniac","Angriff","aktiv");
        pg = new Spieler("PG",23,"PG","Angriff","aktiv");
        tine = new Spieler("Tine",21,"Tine","Mittelfeld","aktiv");

        beamforce.setTeamName("Beamforce ONE");
        btb.setTeamName("BTB");

        whiteWolf.updateScore(9001);
        bloodyMary.updateScore(200);
        reitermaniac.updateScore(300);

        pg.updateScore(1000);
        tine.updateScore(900);


    }

    @org.junit.Test
    public void getSortedList() throws Exception {
        ArrayList<Sortable> list1=new ArrayList<Sortable>();
        list1.add(whiteWolf);
        list1.add(bloodyMary);
        list1.add(reitermaniac);

        ArrayList<Spieler> playerList=new ArrayList<Spieler>();
        playerList.add(whiteWolf);
        playerList.add(bloodyMary);
        playerList.add(reitermaniac);


        ArrayList<Sortable> list2=new ArrayList<Sortable>();
        list2.add(pg);
        list2.add(tine);

        ArrayList<Spieler> sortedList=(ArrayList<Spieler>)Rangliste.getSortedList(list1);

        assertEquals("Erwartet White Wolf",playerList.get(0),sortedList.get(0));
        assertEquals("Erwartet Reitermaniac",playerList.get(2),sortedList.get(1));
        assertEquals("Erwartet BloodyMary",playerList.get(1),sortedList.get(2));

    }

    @org.junit.Test
    public void getReverseSortedList() throws Exception {

        ArrayList<Sortable> list1=new ArrayList<Sortable>();
        list1.add(whiteWolf);
        list1.add(bloodyMary);
        list1.add(reitermaniac);

        ArrayList<Spieler> playerList=new ArrayList<Spieler>();
        playerList.add(whiteWolf);
        playerList.add(bloodyMary);
        playerList.add(reitermaniac);


        ArrayList<Sortable> list2=new ArrayList<Sortable>();
        list2.add(pg);
        list2.add(tine);

        ArrayList<Spieler> sortedList=(ArrayList<Spieler>)Rangliste.getSortedList(list1,false);

        assertEquals("Erwartet White Wolf",playerList.get(0),sortedList.get(2));
        assertEquals("Erwartet Reitermaniac",playerList.get(2),sortedList.get(1));
        assertEquals("Erwartet BloodyMary",playerList.get(1),sortedList.get(0));

    }

    @org.junit.Test
    public void getTeamList() throws Exception {

        ArrayList<Sortable> list1=new ArrayList<Sortable>();
        list1.add(beamforce);
        list1.add(btb);

        ArrayList<Team> playerList=new ArrayList<Team>();
        playerList.add(beamforce);
        playerList.add(btb);


        ArrayList<Team> sortedList=(ArrayList<Team>)Rangliste.getSortedList(list1);

        assertEquals("Erwartet beamforce",playerList.get(0),sortedList.get(0));
        assertEquals("Erwartet btb",playerList.get(1),sortedList.get(1));

    }

    @org.junit.Test
    public void getReverseTeamList() throws Exception {

        ArrayList<Sortable> list1=new ArrayList<Sortable>();
        list1.add(beamforce);
        list1.add(btb);

        ArrayList<Team> playerList=new ArrayList<Team>();
        playerList.add(beamforce);
        playerList.add(btb);


        ArrayList<Team> sortedList=(ArrayList<Team>)Rangliste.getSortedList(list1,false);

        assertEquals("Erwartet beamforce",playerList.get(0),sortedList.get(1));
        assertEquals("Erwartet btb",playerList.get(1),sortedList.get(0));

    }



}