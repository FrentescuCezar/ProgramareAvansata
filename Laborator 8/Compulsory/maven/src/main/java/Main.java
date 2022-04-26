import dao.ContinentDAO;
import dao.CountryDAO;
import singleton.Database;

import java.sql.SQLException;

public class Main {
    public static void main(String args[]) throws SQLException {
        try {
            Database.createConnection();

            var continents = new ContinentDAO();

            continents.create("Europe");
            continents.create("North America");
            continents.create("Asia");

            Database.getConnection().commit();

            var countries = new CountryDAO();

            int europeId = continents.findByName("Europe");
            countries.create("Romania", europeId);
            countries.create("Ukraine", europeId);

            int africaId = continents.findByName("Africa");
            countries.create("Nigeria", africaId);

            Database.getConnection().commit();
            Database.getConnection().close();

        } catch (SQLException e) {
            System.out.println(e);
            Database.rollback();
        }
    }
}