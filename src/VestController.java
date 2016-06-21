import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

/**
 * Created by anna on 20.06.16.
 */
public class VestController {

    @FXML
    private ListView vest1;
    @FXML
    private ListView vest2;
    @FXML
    private ListView vest3;
    @FXML
    private ListView vest4;
    @FXML
    private ListView vest5;
    @FXML
    private ListView vest6;
    @FXML
    private ListView vest7;
    @FXML
    private ListView vest8;
    @FXML
    private ListView vest9;
    @FXML
    private ListView vest10;
    @FXML
    private ListView vest11;
    @FXML
    private ListView vest12;

    public void initialize(){
        Vest vest1 = new Vest (1, (float) 62.5, 16, 5, 3, "ready");
        Vest vest2 = new Vest (2, (float) 70.0, 26, 7, 3, "ready");
        Vest vest3 = new Vest (3, (float) 70.0, 104, 28, 12, "loading");
        Vest vest4 = new Vest (4, 0, -189, 0, 63, "defect");
        Vest vest5 = new Vest (5, (float) 70.0, 26, 7, 3, "ready");
        Vest vest6 = new Vest (6, (float) 70.0, 26, 7, 3, "ready");
        Vest vest7 = new Vest (7, (float) 70.0, 26, 7, 3, "ready");
        Vest vest8 = new Vest (8, 0, -189, 0, 63, "defect");
        Vest vest9 = new Vest (9, (float) 70.0, 26, 7, 3, "ready");
        Vest vest10 = new Vest (10, (float) 70.0, 26, 7, 3, "ready");
        Vest vest11 = new Vest (11, (float) 70.0, 26, 7, 3, "ready");
        Vest vest12 = new Vest (12, (float) 70.0, 26, 7, 3, "ready");

        ObservableList<String> vestNumbers= FXCollections.observableArrayList();
        for (Vest val:Main.globalVests){
            vestNumbers.add(Integer.toString(val.getVestNumber()));
        }
    }


}