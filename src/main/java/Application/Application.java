package Application;

import org.apache.commons.dbcp2.BasicDataSource;
import java.io.File;


public class Application {

    //Instance Vars


    //Constructors
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/library");
        dataSource.setUsername("");
        dataSource.setPassword("");

        File inputFile;



        //Start the fact CLI

    }


}

