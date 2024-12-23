package Users;

public abstract class User {
    private int id;
    private final String firstName;
    private final String secondName;
    private String tellNo;

    private Position position;
    private int salary;

    private String login;
    private String password;

    public User(int id, String firstName, String secondName, String tellNo, Position position, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.tellNo = tellNo;
        this.position = position;
        this.salary = salary;
    }
    public void signUp(String login, String password){
        if(this.login != null || this.password != null)
            throw new IllegalArgumentException("Login or password is already set");
        this.login = login;
        this.password = password;
    }

    public void changePosition(Position position){
        this.position = position;
    }
    public void changeSalary(int salary){
        this.salary = salary;
    }
    public boolean Loggining(String login, String password){
        if(this.login == null || this.password == null)
            throw new IllegalArgumentException("Login ERROR: Login or password is null");
        return this.login.equals(login) && this.password.equals(password);
    }

    public int getId() {
        return id;
    }

    public String getFullName(){
        return firstName + " " + secondName;
    }

    public String getTellNo() {
        return tellNo;
    }

    public Position getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}
