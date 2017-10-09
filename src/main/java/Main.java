import java.sql.*;

/**
 * Created by RuLemur on 19.07.2017.
 */
public class Main {

    public static final String URL = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "root";


    public static void main(String[] args) {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); Statement statement = connection.createStatement()) {
//            statement.execute("INSERT INTO users(name,age,email) VALUES('boris',11,'qwer@asf.as');");
//            int upd = statement.executeUpdate("UPDATE users SET name = 'Max' where name = 'igor'");
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM users;");
            String query = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                System.out.println(id);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
