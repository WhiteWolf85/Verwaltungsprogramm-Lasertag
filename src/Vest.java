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

    public Vest()  { Main.globalVests.add(this); }


    public int getVestNumber() {
        return this.vestNumber;
    }
    public float getRatio() {
        return this.ratio;
    }
    public int getScore() {
        return this.score;
    }
    public int getHits() {
        return this.hits;
    }
    public int getHitsby() {
        return this.hitsby;
    }

    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void setVestNumber(int vestId) {
        this.vestNumber = vestId;
    }
    public void setRatio(float vestRatio) {
        this.ratio = vestRatio;
    }
    //kein setScore, da nur lesbar, nicht veränderbar
    public void setHits(int dealtHits) {
        this.hits = dealtHits;
    }
    public void setHitsby(int receivedHits) {
        this.hitsby = receivedHits;
    }






    public void calculateScore () {
        this.score = (this.hits * 5) - (this.hitsby * 3);
    }

    public void calculateRatio () {
        this.ratio = (float) this.hits * 100 / (float) (this.hits + this.hitsby);
    }

}
