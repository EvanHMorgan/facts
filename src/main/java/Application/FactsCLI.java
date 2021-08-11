package Application;

public class FactsCLI {

    //Instance Variables
    private static final String MAIN_MENU_DISPLAY_ALL_FACTS = "Display All Facts";
    private static final String MAIN_MENU_SEARCH_FACT = "Search For a Fact";
    private static final String MAIN_MENU_CREATE_FACT = "Create a Fact";
    private static final String MAIN_MENU_UPDATE_FACT = "Update an Existing Fact";
    private static final String MAIN_MENU_DELETE_FACT = "Delete an Existing Fact";
    private static final String[] MAIN_MENU_OPTIONS = {
            MAIN_MENU_DISPLAY_ALL_FACTS,
            MAIN_MENU_SEARCH_FACT,
            MAIN_MENU_CREATE_FACT,
            MAIN_MENU_UPDATE_FACT,
            MAIN_MENU_DELETE_FACT };

    private static final String SEARCH_MENU_SEARCH_BY_TITLE = "Search By Title";
    private static final String SEARCH_MENU_SEARCH_BY_CONTENTS = "Search By Contents";
    private static final String SEARCH_MENU_SEARCH_BY_ID = "Search By ID#";
    private static final String SEARCH_MENU_SEARCH_BY_DATE = "Search By Date";
    private static final String[] SEARCH_MENU_OPTIONS = {
            SEARCH_MENU_SEARCH_BY_TITLE,
            SEARCH_MENU_SEARCH_BY_CONTENTS,
            SEARCH_MENU_SEARCH_BY_ID,
            SEARCH_MENU_SEARCH_BY_DATE };

    private Menu menu;
    private SearchMenu searchMenu;
    private StockFacts stockFacts;


    //Constructors
    public FactsCLI(Menu menu, SearchMenu searchMenu, StockFacts stockFacts) {
        this.menu = menu;
        this.searchMenu = searchMenu;
        this.stockFacts = stockFacts;
    }


    //Getters & Setters


    //Methods
    public void run() {
        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            switch (choice) {
                case MAIN_MENU_DISPLAY_ALL_FACTS:
                    System.out.println("Displaying all facts");
                    break;
                case MAIN_MENU_SEARCH_FACT:
                    break;
                case MAIN_MENU_CREATE_FACT:
                    break;
                case MAIN_MENU_UPDATE_FACT:
                    break;
                case MAIN_MENU_DELETE_FACT:
                    break;
            }
        }
    }


}
