import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;
class Student extends User {
    Scanner sc = new Scanner(System.in);

    public Student(String username, String password) {
        super(username, password);

    }
    public void displayMenu() {
        int choice;
        do {
            System.out.println("Welcome to School System Student");
            System.out.println("1-ViewAllAvailableAssignments");
            System.out.println("2-ViewGrades");
            System.out.println("3 -SubmitAssignment");
            System.out.println("4-exit");
            choice=doMenuCommand();
        }while(choice != 4);
    }

    public int doMenuCommand() {
        int choice;
        do {
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    ViewAllAvailableAssignments();
                    break;
                case 2:
                    ViewGrades();
                    break;
                case 3:
                    SubmitAssignment();
                    break;
                case 4:
                    System.out.println("You are exitted the system");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (choice<=1 || choice>=4);
        return choice;
    }
    public void  ViewAllAvailableAssignments() {
        String sql = "SELECT nameofthehomework, description FROM assignments";

        try (Connection conn = MyJDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Available Assignments:");
            while (rs.next()) {
                String homeworkName = rs.getString("nameofthehomework");
                String description = rs.getString("description");
                System.out.println("Homework Name: " + homeworkName);
                System.out.println("Description: " + description);
                System.out.println("--------------");
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving assignments: " + e.getMessage());
        }

    }
    public void ViewGrades() {

    }
    public void SubmitAssignment() {

    }
}