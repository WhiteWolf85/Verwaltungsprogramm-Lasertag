import java.util.ArrayList;

/**
 * Created by franz on 16.05.16.
 */


public interface RanglisteInterface {

    public ArrayList<Sortable> getSortedList(ArrayList<Sortable> list, int way);
    public ArrayList<Sortable> getSortedList(ArrayList<Sortable> list);

}
