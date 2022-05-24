package dao;

import lab8.DBCPDataSource;

import java.sql.*;

public class CountryDAO {

    public void create(String name, String code, int continent_id) throws SQLException {
        Connection con = DBCPDataSource.getConnection();

        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO countries (name, code, continent_id) values (?,?,?)")) {
            pstmt.setString(1, name);
            pstmt.setString(2, code);
            pstmt.setInt(3, continent_id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Integer findByName(String name) throws SQLException {
        Connection con = DBCPDataSource.getConnection();
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery("SELECT id FROM countries WHERE name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }

    public String findById(int id) throws SQLException {
        Connection con = DBCPDataSource.getConnection();
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery("SELECT name FROM countries WHERE id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }
}
