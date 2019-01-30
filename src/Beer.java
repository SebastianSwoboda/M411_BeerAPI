import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Beer {

    HashMap<Integer, String> beerList = new HashMap<>();
    List<Data> data = new ArrayList();


    public void loadBeerStyles() {

        for (int i = 0; i < data.size(); i++) {
            beerList.put(data.get(i).getId(), data.get(i).getName());
        }
        System.out.println(beerList);
    }

    public void printBeerStyles() {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).getId() + "::" + data.get(i).getName());
        }

    }

    public void printBeerStyles(String search) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().contains(search)) {
                System.out.println(data.get(i).getId() + "::" + data.get(i).getName());
            }
        }
    }
    public void printBeerList() {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).getId());
            System.out.println(data.get(i).getName());
        }
    }

    public void printBeer(String id) {
        for (int i = 0; i < data.size(); i++) {
            if (String.valueOf(data.get(i).getId()).equals(id)) {
                System.out.println(data.get(i).getId() + "::" + data.get(i).getName());
                System.out.println(data.get(i).getDescription());
            }
        }
    }
}


