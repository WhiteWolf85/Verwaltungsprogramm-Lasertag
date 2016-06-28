import java.util.ArrayList;

/**
 * Created by franz on 16.05.16.
 */
public class Rangliste {

    public static ArrayList<? extends Sortable> getSortedList(ArrayList<Sortable> list){
        return getSortedList(list,true);
    }

    public static ArrayList<? extends Sortable> getSortedList(ArrayList<Sortable> list, boolean way){

        boolean sort=true;
        Sortable puffer;

        while(sort) {
            sort=false;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).getScore() < list.get(i + 1).getScore()) {
                        puffer = list.get(i);
                        list.set(i,list.get(i + 1));
                        list.set(i + 1,puffer);
                        sort = true;
                }
            }
        }

        if(way){
            return list;
        }else{
            return reverseList(list);
        }

    }

    private static ArrayList<Sortable> reverseList(ArrayList<Sortable> list){
        ArrayList<Sortable> reverseList=new ArrayList<Sortable>();
        for(int i=list.size()-1;i>=0;i--){
            reverseList.add(list.get(i));
        }
        return reverseList;
    }

}
