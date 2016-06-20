import java.util.ArrayList;

/**
 * Created by franz on 16.05.16.
 */


public interface RanglisteInterface {

    public ArrayList<? extends Sortable> getSortedList(ArrayList<Sortable> list, boolean reverseSort);
    public ArrayList<? extends Sortable> getSortedList(ArrayList<Sortable> list);

}
