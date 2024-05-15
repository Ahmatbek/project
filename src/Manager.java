import java.util.Scanner;

class Manager extends User {
    Scanner scanner = new Scanner(System.in);

    public Manager(String username, String password) {
        super(username, password);

    }
    public void displayMenu() {
        int choice ;
        do{
            System.out.println("Welcome to School System Manager");
            System.out.println("1-Plan the courses");
            System.out.println("2-Monitor students performances");
            System.out.println("3 Exit");
            choice = doMenuCommand();
        }while(choice != 3);

    }
    public int doMenuCommand() {
        int choice = 0 ;
        do{
            System.out.println("Please choose one of the options");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    PlanTheCourses();
                    break;
                case 2:
                    MonitorStudentsPerformance();
                    break;
                case 3:
                    System.out.println("you are exitted the system");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (choice<=1 || choice>=3);
        return choice;
    }
    public void PlanTheCourses() {

    }
    public void MonitorStudentsPerformance() {

    }
}