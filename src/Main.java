import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class Main {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://api.brewerydb.com/v2/styles/?key=1511d0db4a1d6841481c672455358cff");
        InputStreamReader reader = new InputStreamReader(url.openStream());

        Beer beer = new Gson().fromJson(reader, Beer.class);

        beer.loadBeerStyles();
        beer.printBeerStyles();
    }
}
