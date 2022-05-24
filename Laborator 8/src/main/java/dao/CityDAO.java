package dao;

import lab8.DBCPDataSource;

import java.sql.*;

public class CityDAO {

    public void create(Integer country_id, String name, Boolean capital, double latitude, double longitude) throws SQLException {
        Connection con = DBCPDataSource.getConnection();

        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO cities (country_id, name, capital, latitude, longitude) values (?,?,?,?,?)")) {
            pstmt.setInt(1, country_id);
            pstmt.setString(2, name);
            pstmt.setBoolean(3, capital);
            pstmt.setDouble(4, latitude);
            pstmt.setDouble(5, longitude);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Integer findByName(String name) throws SQLException {
        Connection con = DBCPDataSource.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id FROM cities WHERE name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    public String findById(int id) throws SQLException {
        Connection con = DBCPDataSource.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT name FROM cities WHERE id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }

    public double getLatitude(String cityName) throws SQLException {
        Connection con = DBCPDataSource.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT latitude FROM cities WHERE name='" + cityName + "'")) {
            return rs.next() ? rs.getDouble(1) : null;
        }
    }

    public double getLongitude(String cityName) throws SQLException {
        Connection con = DBCPDataSource.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT longitude FROM cities WHERE name='" + cityName + "'")) {
            return rs.next() ? rs.getDouble(1) : null;
        }
    }

    public double distance(String city1, String city2) throws SQLException {

        double lon1 = getLongitude(city1);
        double lon2 = getLongitude(city2);
        double lat1 = getLatitude(city1);
        double lat2 = getLatitude(city2);

        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        double r = 6371;

        return(c * r);
    }
}
