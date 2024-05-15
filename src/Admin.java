class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);

    }

    public void displayMenu(){
        System.out.println("Welcome to School System Administrator");
        System.out.println("1-Add students");
        System.out.println("2-Remove students");
        System.out.println("3 Add courses-");
        System.out.println("4-Remove courses");
        System.out.println("5-Exit");
    }
    public void doMenuCommand( int option){
        switch(option){
           case 1:
               addstudents();
               break;
            case 2:
                removestudents();
                break;
            case 3:
                addcourses();
                break;
            case 4:
                removecourses();
                break;
            case 5:
                System.out.println("you are exitted the system");
                break;
            default:
                System.out.println("Invalid option");
                break;

        }
    }
    public void addstudents(){

    }
    public void removestudents(){

    }
    public void addcourses(){

    }
    public void removecourses(){

    }

}