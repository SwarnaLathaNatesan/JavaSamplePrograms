package basicPrograms;

import java.sql.*;

public class JdbcDemo {

    // Database URL, username, and password
    static final String DB_URL = "jdbc:mysql://localhost:3306/travelmgmtsystem";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {

        // Create a connection to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a new table
            createTable(conn);

            // Insert data into the table
            insertData(conn);

            // Retrieve data from the table
            retrieveData(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Creates a new table
    private static void createTable(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS Employees " +
                "(id INTEGER not NULL, " +
                " name VARCHAR(255), " +
                " age INTEGER, " +
                " PRIMARY KEY ( id ))";
        stmt.executeUpdate(sql);
        stmt.close();
    }

    // Inserts data into the table
    private static void insertData(Connection conn) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Employees VALUES (?, ?, ?)");
        pstmt.setInt(1, 1);
        pstmt.setString(2, "John");
        pstmt.setInt(3, 35);
        pstmt.executeUpdate();
        pstmt.close();
    }

    // Retrieves data from the table
    private static void retrieveData(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql = "SELECT id, name, age FROM Employees";
        ResultSet rs = stmt.executeQuery(sql);

        // Display the data
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }

        rs.close();
        stmt.close();
    }
}
