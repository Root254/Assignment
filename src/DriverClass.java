import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverClass {
    public static void main(String [] args) {

        try {
            Connection connection = DBConnnector.getConnection();
            ResultSet rs = connection.createStatement().executeQuery("SELECT Employee_ID, Eployee_name, Empoyee_designation FROM hr.employee");

            while (rs.next()) {
                System.out.println("Employee_ID: "+rs.getInt("Employee_ID")+ " Eployee_name: " + rs.getString("Eployee_name") +" Empoyee_designation: "+ rs.getString("Empoyee_designation"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
