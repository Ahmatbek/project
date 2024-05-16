class Teacher extends User {


    public Teacher(String username, String password) {
        super(username, password);

    }

    public void displayMenu() {

        System.out.println("Welcome to School System Teacher");
        System.out.println("1-Add Assignment");
        System.out.println("2-Grade Assignment");
        System.out.println("3 -Exit");
    }

    public void doMenuCommand(int option) {
        switch (option) {
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
    }
    public void addAssignment() {

    }
    public void gradeStudent() {

    }
}