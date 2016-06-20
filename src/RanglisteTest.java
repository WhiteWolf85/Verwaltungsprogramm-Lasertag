import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.*;

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
    Rangliste sort;

    @Before
    public void startTest(){

        // initiiert die globalen Listen, da auf die Konstruktoren von Spieler und Team zugegriffen werden muss
        Main.setGlobalValues();

        whiteWolf = new Spieler();
        bloodyMary = new Spieler();
        reitermaniac=new Spieler();
        pg = new Spieler();
        tine = new Spieler();
        sort=new Rangliste();

        beamforce=new Team("Beamforce ONE");
        btb=new Team("BTB");

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

    }

    @org.junit.Test
    public void getSortedList() throws Exception {
        ArrayList<Sortable> list1=new ArrayList<Sortable>();
        list1.add(whiteWolf);
        list1.add(bloodyMary);
        list1.add(reitermaniac);

        ArrayList<Spieler> sortedList=(ArrayList<Spieler>)sort.getSortedList(list1);

        assertEquals("Erwartet White Wolf",whiteWolf,sortedList.get(0));
        assertEquals("Erwartet Reitermaniac",reitermaniac,sortedList.get(1));
        assertEquals("Erwartet BloodyMary",bloodyMary,sortedList.get(2));

    }

    @org.junit.Test
    public void getReverseSortedList() throws Exception {

        ArrayList<Sortable> list1=new ArrayList<Sortable>();
        list1.add(whiteWolf);
        list1.add(bloodyMary);
        list1.add(reitermaniac);

        ArrayList<Spieler> sortedList=(ArrayList<Spieler>)sort.getSortedList(list1,true);

        assertEquals("Erwartet White Wolf",whiteWolf,sortedList.get(2));
        assertEquals("Erwartet Reitermaniac",reitermaniac,sortedList.get(1));
        assertEquals("Erwartet BloodyMary",bloodyMary,sortedList.get(0));

    }



}