/**
 * Created by anna on 16.05.16.
 */
import java.util.Scanner;

public class Vest implements VestInterface {

    private int vestNumber;

    public Vest (int i) {
        i = vestNumber;
    }

    public void status() {
        String status;
    }

    public float ratio(){
        int hits, hitsby;
        float ratio;
        ratio = hits * 100 / (hits + hitsby);
        return ratio;
    }

    public int score(){
        int score, posScore, negScore, hits, hitsby;
        posScore= hits * 5;
        negScore = hitsby * 3;
        score = posScore - negScore;
        return score;
    }

    public float batteryCharge(){
        float maxBattery, minBattery, batteryCharge;
        maxBattery = (float) 8.0;
        minBattery = (float) 5.0;
        batteryCharge = maxBattery;
        return batteryCharge;
    }


}
