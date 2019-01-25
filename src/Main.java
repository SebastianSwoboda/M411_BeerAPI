import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Main {

    public static void main(String[] args) throws IOException {


        String line = "";
        String jsonString = "";
        URL myUrl = new   URL("http://api.brewerydb.com/v2/styles/?key=1511d0db4a1d6841481c672455358cff");
        BufferedReader reader = new BufferedReader( new InputStreamReader(myUrl.openStream()) );
        Beer beer = new Gson().fromJson(reader, Beer.class);
        reader.close();

        beer.loadBeerStyles();


    }
}
