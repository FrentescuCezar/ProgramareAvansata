package dao;

import java.sql.*;
import singleton.Database;

public class CountryDAO {

    public void create(String name, int code) throws SQLException {
        Connection con = Database.getConnection();
        String continent_name = "";
       try {
           ContinentDAO continent = new ContinentDAO();
           continent_name = continent.findById(code);
       } catch(SQLException e) {
           System.out.println("Continent not found.");
       }

        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO countries (name, code, continent) values (?,?,?)")) {
            pstmt.setString(1, name);
            pstmt.setInt(2, code);
            pstmt.setString(3, continent_name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery("SELECT id FROM countries WHERE name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    public String findById(int id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery("SELECT name FROM countries WHERE id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}
