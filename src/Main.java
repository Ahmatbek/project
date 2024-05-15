import java.sql.*;
import java.sql.SQLException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        login(scanner);

    }

    public static void login(Scanner scanner) {
        ResultSet rs = null;
        Connection connection = null;
        PreparedStatement stmt = null;
        try {
            connection = MyJDBC.getConnection();
            System.out.println("Enter your username");
            String username = scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.nextLine();

            String query = "SELECT username , password , accountType FROM user WHERE username =? AND password =?";
            stmt = connection.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String accountType = rs.getString("accountType");
                System.out.println("Login successfully");
                switch (accountType) {
                    case "Admin":
                        System.out.println("Welcome Admin");
                        Admin admin = new Admin(username, password);
                        admin.displayMenu();
                        break;
                    case "Manager":
                        System.out.println("Welcome Manager");
                        Manager manager = new Manager(username, password);
                        manager.displayMenu();
                        break;
                    case "Teacher":
                        System.out.println("Welcome Teacher");
                        Teacher teacher = new Teacher(username, password);
                        teacher.displayMenu();
                        break;
                    case "Student":
                        System.out.println("Welcome Student");
                        Student student = new Student(username, password);
                        student.displayMenu();
                        break;
                    default:
                        System.out.println("Invalid account type");
                        break;
                }
            } else {
                System.out.println("Invalid username or password");
            }

        } catch (SQLException e) {
            System.out.println("Connection error" + e.getMessage());

        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                System.out.println("Connection error" + ex.getMessage());
            }
        }

    }

}
