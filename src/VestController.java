import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * Created by anna on 20.06.16.
 */
public class VestController {

    @FXML
    public Label label1, label2, label3, label4, label5;
    public Button vest1, vest2, vest3, vest4, vest5, vest6, vest7, vest8, vest9, vest10, vest11, vest12;

    public void reactToButtonClickV1(ActionEvent actionEvent) {
        Vest vest1 = new Vest();
        vest1.randomHits();
        vest1.randomHitsby();
        vest1.calculateScore();
        vest1.calculateRatio();
        vest1.randomStatus();
        label1.setText(String.valueOf(vest1.getHits()));
        label2.setText(String.valueOf(vest1.getHitsby()));
        label3.setText(String.valueOf(vest1.getScore()));
        label4.setText(String.valueOf(vest1.getRatio()));
        label5.setText(String.valueOf(vest1.getStatus()));
    }

}