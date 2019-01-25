import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Beer {
    List<Data> data = new ArrayList();

    public void print() {
        System.out.println();
    }


    public void loadBeerStyles() {
        HashMap<Integer, String> beerList = new HashMap<>();

        for (int i = 0; i < data.size(); i++) {
            beerList.put(data.get(i).getId(), data.get(i).getName());
        }
        System.out.println(beerList);
        }
    public void printBeerStyles()
    {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).getId()  + "::" + data.get(i).getName());
        }

    }

    public void printBeerStyles(String search) {

    }
    public void getBeerListForStyle(int idStyle) {

    }
}


