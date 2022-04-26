package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5050/lab8";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres_passwd";
    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }

    public static void createConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully.");
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection closed successfully.");
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void rollback() throws SQLException {
        try {
            connection.rollback();
            System.out.println("Rolled back.");
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}

