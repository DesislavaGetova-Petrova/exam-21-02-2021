package exam.exam.model.binding;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

public class UserRegisterBindingModel {




    private String username;
    private String fullName;
    private String email;
    private String password;
    private String confirmPassword;

    public UserRegisterBindingModel() {
    }
    @Length(min=3, max=20,message = "Username length must be between 3 and 20 characters")
    public String getUsername() {
        return username;
    }

    public UserRegisterBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }
    @Length(min=3, max=20,message = "FullName length must be between 3 and 20 characters")
    public String getFullName() {
        return fullName;
    }
    public UserRegisterBindingModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @Email(message = "Must be valid email")
    public String getEmail() {
        return email;
    }

    public UserRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }
    @Length(min=5, max=20, message ="Password length must be between 5 and 20 characters")
    public String getPassword() {
        return password;
    }

    public UserRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }
    @Length(min=5, max=20, message ="Password length must be between 5 and 20 characters")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
