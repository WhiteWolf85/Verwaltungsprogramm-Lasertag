/**
 * Created by anna on 16.05.16.
 */
public class Vest implements VestInterface {

    public String status(){
        String status;
        return "OK";
    }

    public float ratio(){
        int hits, hitsby;
        float ratio;
        hits = 5;
        hitsby = 3;
        ratio = hits * 100 / (hits + hitsby);
        return ratio;
    }

    public int score(){
        int score, hits, hitsby;
        hits= 5;
        hitsby = 3;
        score = hits - hitsby;
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
