package lab8;

import dao.CityDAO;
import dao.ContinentDAO;
import dao.CountryDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            DBCPDataSource ds = new DBCPDataSource();
            Database.createConnection();
            //var continents = new ContinentDAO();

            //add continents to database

            //continents.create("Asia");
            //continents.create("Africa");
            //continents.create("Europe");
            //continents.create("North America");
            //continents.create("South America");
            //continents.create("Australia");
            //continents.create("Antarctica");
            //Database.commitChanges();

            var countries = new CountryDAO();

            //add countries to database

            //int europeId = continents.findByName("Europe");
            //countries.create("Romania", "RO", europeId);
            //countries.create("Ukraine", "UA", europeId);
//
            //int africaId = continents.findByName("Africa");
            //countries.create("Egypt","EG", africaId);
//
            //Database.commitChanges();


            var cities = new CityDAO();
            //add cities to database

            //int romaniaId = countries.findByName("Romania");
            cities.create(1,"Iasi",false, 47.163574, 27.582550);
            Database.commitChanges();
            cities.create(1,"Bucharest",false, 44.4396, 26.1521);
            Database.commitChanges();

            System.out.println(cities.distance("Bucharest", "Iasi") + " km");//distance in km
            Mercator map = new SphericalMercator(); // Or Eliptical
            System.out.println("\n" + map.xAxisProjection(34.51666667));
            System.out.println(map.yAxisProjection(69.183333));
            DBCPDataSource.getConnection().close();
            //new SwingGUI();

        } catch (SQLException e) {
            e.printStackTrace();
            Database.rollback();
        }
    }
}

