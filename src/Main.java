import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        BeerAdmin api = new BeerAdmin();

        api.apiCall();


        //api.loadBeerStyles();
        //api.printBeerStyles();
        //api.printBeerStyles("Br");
        //api.getBeerListForStyle(5);
        api.printBeer("2");
    }
}
