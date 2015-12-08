package controller;

import model.Show;
import model.Theater;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by scavenius on 12/8/15.
 *
 * most of the code was taken from TODO find link to where we "borrowed" this
 *
 */
public final class Instanciator {

    //  Database credentials
    static final String DB = "ProjectCinema";
    static final String USER = "ATM";
    static final String PASS = "a97531";

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://mysql.itu.dk/" + DB;

    public static ArrayList<Theater> createTheaterList() {

        Connection connection = null;
        Statement statement = null;
        ArrayList<Theater> returnArray = new ArrayList<Theater>();

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // STEP 2: Register JDBC driver
            connection = DriverManager.getConnection(DB_URL, USER, PASS); // STEP 3: Open a connection
            statement = connection.createStatement(); // STEP 4: Execute a query

            String sql = "SELECT * FROM theaters ORDER BY theaters , theater_identifier ASC LIMIT 0 , 30";
            ResultSet rs = statement.executeQuery(sql);
            //STEP 5: Extract data from result set
            while (rs.next()) { //Retrieve by column name
                int time = rs.getInt("time");
                String date = rs.getString("date");
                String film = rs.getString("Film");

                // int id  = rs.getInt("id");
                String theater = rs.getString("theater_identifier");
                //String name = rs.getString("seats");
                //Display values
                System.out.println("theater: '" + theater + "'");
            }
            rs.close();
            connection.close();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }

        return returnArray;
    }

    public static ArrayList<Show> createShowlist() {

        Connection connection = null;
        Statement statement = null;
        ArrayList<Show> returnArray = new ArrayList<Show>();

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // STEP 2: Register JDBC driver
            connection = DriverManager.getConnection(DB_URL, USER, PASS); // STEP 3: Open a connection
            statement = connection.createStatement(); // STEP 4: Execute a query

            String sql = "SELECT * FROM shows ORDER BY shows , date ASC LIMIT 0 , 30";
            ResultSet rs = statement.executeQuery(sql);
            //STEP 5: Extract data from result set
            while (rs.next()) { //Retrieve by column name
                int time = rs.getInt("time");
                String date = rs.getString("date");
                String film = rs.getString("Film");

                // int id  = rs.getInt("id");
                String theater = rs.getString("theater_identifier");
                //String name = rs.getString("seats");
                //Display values
                System.out.println("theater: '" + theater + "'");
            }
            rs.close();
            connection.close();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }

        return returnArray;
    }

}
