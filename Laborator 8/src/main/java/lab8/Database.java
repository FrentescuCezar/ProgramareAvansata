package lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "desene123";
    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }

    public static void createConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the PostgresSQL server successfully.");
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("\nConnection closed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void commitChanges() {
        try {
            connection.commit();
            System.out.println("\nCommit successfully made!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void rollback() throws SQLException {
        try {
            connection.rollback();
            System.out.println("Rolled back.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

