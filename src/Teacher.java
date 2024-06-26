import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Teacher extends User {
    Scanner sc = new Scanner(System.in);

    public Teacher(String username, String password) {
        super(username, password);

    }

    public void displayMenu() {
        int choice;
        do{
        System.out.println("Welcome to School System Teacher");
        System.out.println("1-Add Assignment");
        System.out.println("2-Grade Assignment");
        System.out.println("3 -Exit");
        choice = doMenuCommand();
        }while(choice != 3);
    }

    public int doMenuCommand() {
        int choice;
        do{
            choice = sc.nextInt();
             switch (choice) {
                case 1:
                   addAssignment();
                  break;
                case 2:
                   gradeStudent();
                   break;
                case 3:
                    System.out.println("you are exitted the system");
                   break;
                 default:
                       System.out.println("Invalid option");
                         break;
            }
        } while (choice < 1 || choice > 3);
        return choice;
    }
    public void addAssignment() {
        String sql = "INSERT INTO assignments(nameofthehomework, description) VALUES (?, ?)";

        try (Connection conn = MyJDBC.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.println("Enter the Name  of the Homework:");
            String username = sc.next();
            sc.nextLine();

            System.out.println("Enter the Description:");
            String password = sc.nextLine();


            // Установка параметров запроса
            pstmt.setString(1, username);
            pstmt.setString(2, password);


            // Выполнение запроса
            pstmt.executeUpdate();
            System.out.println("You successfully added homework to the system.");
        } catch (SQLException e) {
            System.out.println("You failed to add the homework : " + e.getMessage());
        }

    }
    public void gradeStudent() {

    }
}