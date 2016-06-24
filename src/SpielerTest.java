import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Tobi on 23.06.2016.
 */
public class SpielerTest {

    Spieler spieler1;

    @Before
    public void initValue() {
        Main.setGlobalValues();
        spieler1 = new Spieler("Tobi", 19, "Ersatzbankhocker", "Mittelfeld", "verletzt");
    }

    @Test
    public void updateScore() throws Exception{

        spieler1.updateScore(20);
        assertEquals(spieler1.getScore(),20);

        spieler1.updateScore(10);
        assertEquals(spieler1.getScore(),30);



    }

}
