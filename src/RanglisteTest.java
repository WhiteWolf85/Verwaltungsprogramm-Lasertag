import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by franz on 18.06.16.
 */
public class RanglisteTest {

    Team beamforce = new Team("Beamforce");
    Team btb = new Team("BTB");
    Spieler whiteWolf = new Spieler();
    Spieler bloodyMary = new Spieler();
    Spieler reitermaniac=new Spieler();
    Spieler pg = new Spieler();
    Spieler tine = new Spieler();
    Rangliste sort=new Rangliste();

    @Before
    public void startTest(){

        beamforce.setTeamName("Beamforce ONE");
        btb.setTeamName("BTB");

        whiteWolf.age=30;
        whiteWolf.name="Franz";
        whiteWolf.status="aktiv";
        whiteWolf.nickName="White Wolf";
        whiteWolf.setRole("Mittelfeld");
        whiteWolf.score=9001;               //over 9000 ;-)

        bloodyMary.age=20;
        bloodyMary.name="Anna";
        bloodyMary.status="aktiv";
        bloodyMary.nickName="Bloody Mary";
        bloodyMary.setRole("Runner");
        bloodyMary.score=689;

        reitermaniac.age=20;
        reitermaniac.name="Tom";
        reitermaniac.status="aktiv";
        reitermaniac.nickName="Reitermaniac";
        reitermaniac.setRole("Runner");
        reitermaniac.score=800;

        pg.age=23;
        pg.name="PG";
        pg.status="aktiv";
        pg.nickName="PG";
        pg.setRole("Runner");
        pg.score=-30;

        tine.age=21;
        tine.name="Tine";
        tine.status="verletzt";
        tine.nickName="Tine";
        tine.setRole("Mittelfeld");
        tine.score=50;

        //beamforce.addToTeam(whiteWolf,beamforce);
        //beamforce.addToTeam(bloodyMary,beamforce);
        //beamforce.addToTeam(reitermaniac,beamforce);
        //btb.addToTeam(pg,btb);
        //btb.addToTeam(tine,btb);
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

        ArrayList<Spieler> sortedList=(ArrayList<Spieler>)sort.getSortedList(list1);

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

        ArrayList<Spieler> sortedList=(ArrayList<Spieler>)sort.getSortedList(list1,false);

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


        ArrayList<Team> sortedList=(ArrayList<Team>)sort.getSortedList(list1);

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


        ArrayList<Team> sortedList=(ArrayList<Team>)sort.getSortedList(list1,false);

        assertEquals("Erwartet beamforce",playerList.get(0),sortedList.get(1));
        assertEquals("Erwartet btb",playerList.get(1),sortedList.get(0));

    }



}