/**
 * Created by anna on 16.05.16.
 */

/*
ToDo:
    -GUI mit dem SceneBuilder bauen. Einfach mal so, wie du sie dir vorstellst.
     Um das Hinzufügen und entfernen der Westen brauchst du dir keine Gedanken machen. Die Initialisieren wir in der Main Methode
    -Klasse VestController erstellen und in deiner GUI-fxml als Controller hinterlegen. (Mit fx:Controller="VestController" im Root Element deiner GUI)
     Die Klasse selber kann erstmal leer bleiben. Da kümmern wir uns morgen drum.
    -Schon mal versuchen, deine Testklasse zu bauen, und die Methoden der Vest Klasse testen.

       PS: Du bist die Beste! :-p (Mitarbeitermotivation und so) :-p
 */


public class Vest implements VestInterface {

    private int vestNumber;
    private float ratio;
    private int score;
    private int hits;
    private int hitsby;
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




    public void Vest(){
        Main.globalVests.add(this);
    }

    public void calculateScore () {
        this.score = (this.hits * 5) - (this.hitsby * 3);
    }

    public void calculateRatio () {
        this.ratio = (float) this.hits * 100 / (float) (this.hits + this.hitsby);
    }

}
