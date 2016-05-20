/**
 * Created by anna on 16.05.16.
 */

public class Vest implements VestInterface {

    private int vestNumber;
    private float ratio;
    private int score;
    private float batteryCharge;
    private int hits;
    private int hitsby;
    private static final float maxBattery = (float) 8.0;
    private static final float minBattery = (float) 5.0;
    private String status;


    public int getVestNumber() {
        return this.vestNumber;
    }
    public float getRatio() {
        return this.ratio;
    }
    public int getScore() {
        return this.score;
    }
    public float getBatteryCharge() {
        return this.batteryCharge;
    }
    public int getHits() {
        return this.hits;
    }
    public int getHitsby() {
        return this.hitsby;
    }
    public String getStatus() {return this.status;}


    public void setVestNumber(int vestId) {
        this.vestNumber = vestId;
    }
    public void setRatio(float vestRatio) {
        this.ratio = vestRatio;
    }
    //kein setScore, da nur lesbar, nicht veränderbar
    public void setBatteryCharge(float battery) {
        this.batteryCharge = battery;
    }
    public void setHits(int dealtHits) {
        this.hits = dealtHits;
    }
    public void setHitsby(int receivedHits) {
        this.hitsby = receivedHits;
    }
    public void setStatus(String status) { this.status = status;  }



    //kommen später in main!
    public void calculateScore () {
        this.score = (this.hits * 5) - (this.hitsby * 3);
    }

    public void calculateRatio () {
        this.ratio = (float) this.hits * 100 / (float) (this.hits + this.hitsby);
    }

}
