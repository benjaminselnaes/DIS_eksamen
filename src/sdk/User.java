package sdk;

/**
 * Created by BenjaminSelnaes on 15/10/15.
 */
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    //private Date created;
    private String status;
    private String email;
    private String type;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setType(String type) {
        this.type = type;
    }
}
