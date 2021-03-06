package model;

import javax.validation.constraints.*;

public class User {


    private int id;
    @NotEmpty(message = "Name cannot Be empty")
    @Size(min = 3, max = 15, message = "Name must be between 3 and 15 characters")
    private String name;
    @NotEmpty(message = "Last Name cannot Be empty")
    @Size(min = 3, max = 20, message = "Last Name must be between 3 and 20 characters")
    private String lastname;
    @Email(message = "Please Enter a Valid Email")
    private String email;
    @Size(min = 8, max = 15, message = "Password must be between 8 and 15 characters")
    @Pattern(regexp = "(.*[A-Z].*)", message = "Password must contain at Least 1 uppercase Letter")
    @Pattern(regexp = "(.*[a-z].*)", message = "Password must contain at Least 1 lowercase Letter")
    @Pattern(regexp = "(.*[0-9].*)", message = "Password must contain at Least 1 number")
    private String password;
    @NotEmpty
    private String repassword;

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getRepassword() {
        return repassword;
    }
}
