package Application;

import Model.FactStore;

import javax.sql.DataSource;

public class StockFacts {

    //Instance Variables
    private Menu menu = new Menu(System.in, System.out);
    private SearchMenu searchMenuCLI;
    private FactsCLI factsCLI;
    private Stockable factStock;


    //Constructors
    public StockFacts(DataSource dataSource) {
        // factStore = new FactCreater(dataSource);
    }


    //Getters & Setters


    //Methods
    public void run() {
        searchMenuCLI = new SearchMenu(menu);
        factsCLI = new FactsCLI(menu, searchMenuCLI);



    }

}
