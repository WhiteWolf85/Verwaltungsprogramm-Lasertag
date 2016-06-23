import java.util.Random;

/**
 * Created by anna on 16.05.16.
 */


public class Vest implements VestInterface {

    private int vestNumber;
    private float ratio;
    private int score;
    private int hits;
    private int hitsby;
    private String status;

    public Vest() {
        Main.globalVests.add(this);
    }


    public int getVestNumber() {
        return this.vestNumber;
    }
    public float getRatio() { return this.ratio; }
    public int getScore() { return this.score; }
    public int getHits() { return this.hits; }
    public int getHitsby() { return this.hitsby; }
    public String getStatus() { return this.status; }


    public void setVestNumber(int vestId) {
        this.vestNumber = vestId;
    }
    public void setRatio(float vestRatio) {
        this.ratio = vestRatio;
    }
    public void setScore(int vestScore) { this.score = vestScore; }
    public void setHits(int dealtHits) { this.hits = dealtHits; }
    public void setHitsby(int receivedHits) {
        this.hitsby = receivedHits;
    }
    public void setStatus (String vestStatus) {this.status = vestStatus; }



    public void randomStatus() {
        String[] status = {"Bereit", "Wird geladen", "In Reparatur"};
        this.status = (status[(int) Math.floor(Math.random() * status.length)]);
    }

    public void randomHits() {
        this.hits = (int) (Math.random() * 10);
    }

    public void randomHitsby() {
        this.hitsby = (int) (Math.random() * 10);
    }

    public void calculateScore() {
        this.score = (this.hits * 5) - (this.hitsby * 3);
    }

    public void calculateRatio() {
        this.ratio = (this.hits + this.hitsby / 100 * this.hits );
    }


}