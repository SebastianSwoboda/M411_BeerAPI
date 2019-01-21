import java.util.ArrayList;
import java.util.HashMap;

public class Beer {

        private int id;
        private String name;
        private String description;
        private int  idStyle;

    HashMap<Integer, String> hashMap = new HashMap<>();
    //ArrayList<data> arrayList = new ArrayList<>();




    public void loadBeerStyles() {
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "gay"+ i);
        }
    }
    public void printBeerStyles() {
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(i + "::" + hashMap.get(i));
        }
    }
    public void printBeerStyles(String search) {

    }
    public void getBeerListForStyle(int idStyle) {

    }
}


