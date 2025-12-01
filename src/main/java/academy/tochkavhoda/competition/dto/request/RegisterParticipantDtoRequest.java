package academy.tochkavhoda.competition.dto.request;

public class RegisterParticipantDtoRequest {
    private String firstName;
    private String lastName;
    private String companyName;
    private String login;
    private String password;

    public RegisterParticipantDtoRequest() {}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
