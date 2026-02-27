import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/student_data";
        String username = "root";
        String password = "SA2104";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return (DriverManager.getConnection(url, username, password));
    }
}
