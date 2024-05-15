class Student extends User {


    public Student(String username, String password) {
        super(username, password);

    }
    public void displayMenu() {
        System.out.println("Welcome to School System Student");
        System.out.println("1-ViewAllAvailableAssignments");
        System.out.println("2-ViewGrades");
        System.out.println("3 -SubmitAssignment");
        System.out.println("4-exit");
    }

    public void doMenuCommand(int option) {
        switch (option) {
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
    }
    public void  ViewAllAvailableAssignments() {

    }
    public void ViewGrades() {

    }
    public void SubmitAssignment() {

    }
}