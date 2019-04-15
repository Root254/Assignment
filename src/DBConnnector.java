import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnnector {
    public static Connection getConnection () throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "");
        return connection;
    }
}
