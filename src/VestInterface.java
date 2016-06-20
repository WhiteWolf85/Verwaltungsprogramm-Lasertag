/**
 * Created by anna on 16.05.16.
 */
interface VestInterface {


    int getVestNumber();

    float getRatio();

    int getScore();

    int getHits();

    int getHitsby();

    String getStatus ();

    void setVestNumber(int vestId);

    void setRatio(float vestRatio);

    void setHits(int dealtHits);

    void setHitsby(int receivedHits);

    void setStatus (String status);


}
