import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anna on 20.06.16.
 */
public class VestTest {

    @Test
    public void getVestNumber() throws Exception {
        Vest vest1 = new Vest();
        vest1.setVestNumber(1);
        assertEquals(1, vest1.getVestNumber());
    }

    @Test
    public void getRatio() throws Exception {
        Vest vest2 = new Vest();
        vest2.setRatio((float) 5.478);
        assertEquals(5.878, vest2.getRatio(), 1);
    }

    @Test
    public void getScore() throws Exception {
        Vest vest3 = new Vest();
        vest3.setHits(10);
        vest3.setHitsby(20);
        vest3.calculateScore();
        assertEquals(-10, vest3.getScore());
    }

    @Test
    public void getHits() throws Exception {
        Vest vest4 = new Vest();
        vest4.setHits(9);
        assertEquals(9, vest4.getHits());
    }

    @Test
    public void getHitsby() throws Exception {
        Vest vest5 = new Vest();
        vest5.setHitsby(22);
        assertEquals(22, vest5.getHitsby());
    }

    @Test
    public void getStatus() throws Exception {
        Vest vest6 = new Vest();
        vest6.setStatus("ready");
        assertEquals("ready", vest6.getStatus());
    }

    @Test
    public void setStatus() throws Exception {
        Vest vest6 = new Vest();
        vest6.setStatus("defect");
        assertEquals("defect", vest6.getStatus());
    }

    @Test
    public void setVestNumber() throws Exception {
        Vest vest1 = new Vest();
        vest1.setVestNumber(1);
        assertEquals(1, vest1.getVestNumber());
    }

    @Test
    public void setRatio() throws Exception {
        Vest vest2 = new Vest();
        vest2.setRatio((float) 5.478);
        assertEquals(5.878, vest2.getRatio(), 1);
    }

    @Test
    public void setHits() throws Exception {
        Vest vest4 = new Vest();
        vest4.setHits(9);
        assertEquals(9, vest4.getHits());
    }

    @Test
    public void setHitsby() throws Exception {
        Vest vest5 = new Vest();
        vest5.setHitsby(22);
        assertEquals(22, vest5.getHitsby());
    }

    @Test
    public void calculateScore() throws Exception {
        Vest vest12 = new Vest();
        vest12.setHits(10);
        vest12.setHitsby(7);
        vest12.calculateScore();
        assertEquals(29, vest12.getScore());
    }

    @Test
    public void calculateRatio() throws Exception {
        Vest vest12 = new Vest();
        vest12.setHits(25);
        vest12.setHitsby(10);
        vest12.calculateRatio();
        assertEquals(71.4, vest12.getRatio(), 1);
    }
}