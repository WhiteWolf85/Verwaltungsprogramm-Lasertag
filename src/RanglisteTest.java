import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by franz on 18.06.16.
 */
public class RanglisteTest {

    Team beamforce = new Team();
    Team btb = new Team();
    Spieler whiteWolf = new Spieler();
    Spieler bloodyMary = new Spieler();
    Spieler pg = new Spieler();
    Spieler tine = new Spieler();

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

        beamforce.addToTeam(whiteWolf,beamforce);
        beamforce.addToTeam(bloodyMary,beamforce);
        btb.addToTeam(pg,btb);
        btb.addToTeam(tine,btb);
    }

    @org.junit.Test
    public void getList() throws Exception {

    }

    @org.junit.Test
    public void getList1() throws Exception {

    }

    @org.junit.Test
    public void getList2() throws Exception {

    }

    @org.junit.Test
    public void getList3() throws Exception {

    }

    @org.junit.Test
    public void getAllPlayers() throws Exception {

    }

    @org.junit.Test
    public void getAllPlayers1() throws Exception {

    }

}