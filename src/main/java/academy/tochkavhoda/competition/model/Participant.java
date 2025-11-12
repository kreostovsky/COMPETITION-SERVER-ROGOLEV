package academy.tochkavhoda.competition.model;

public class Participant {
    private String firstName;
    private String lastName;
    private String companyName;
    private String login;
    private String password;

    public Participant(String firstName, String lastName, String companyName, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
