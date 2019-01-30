import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class BeerApi {
    Beer beer;

    {
        try {
            beer = apiCall();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Beer apiCall() throws IOException {

        URL myUrl = new URL("http://api.brewerydb.com/v2/styles/?key=1511d0db4a1d6841481c672455358cff");
        BufferedReader reader = new BufferedReader(new InputStreamReader(myUrl.openStream()));
        Beer beer = new Gson().fromJson(reader, Beer.class);
        reader.close();

        return beer;
    }

    public void loadBeerStyles() {
        beer.loadBeerStyles();
    }

    public void printBeerStyles() {
        beer.printBeerStyles();
    }

    public void printBeerStyles(String search) {
        beer.printBeerStyles(search);
    }

    //WIP
    public void getBeerListForStyle(int idStyle) throws IOException {
        URL myUrl = new URL("http://api.brewerydb.com/v2/styles/?key=1511d0db4a1d6841481c672455358cff&styleId="+idStyle);
        BufferedReader reader = new BufferedReader(new InputStreamReader(myUrl.openStream()));
        Beer beer = new Gson().fromJson(reader, Beer.class);
        reader.close();

        beer.loadBeerStyles();

    }
}
