/**
 * Created by anna on 16.05.16.
 */
interface VestInterface {


    int getVestNumber();

    float getRatio();

    int getScore();

    int getHits();

    int getHitsby();

    void setVestNumber(int vestId);

    void setRatio(float vestRatio);

    void setHits(int dealtHits);

    void setHitsby(int receivedHits);


    String getStatus();

    void randomStatus();

    void randomHits();

    void randomHitsby();

    void calculateScore();

    void calculateRatio();
}
