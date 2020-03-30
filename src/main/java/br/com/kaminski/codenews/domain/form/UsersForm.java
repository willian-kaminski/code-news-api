package br.com.kaminski.codenews.domain.form;

import br.com.kaminski.codenews.domain.User;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UsersForm {

    @NotNull
    @NotEmpty
    @Length(min = 5, max = 255)
    private String name;

    @NotNull
    @NotEmpty
    @Email
    @Length(min = 10, max = 255)
    private String email;

    @NotNull
    @NotEmpty
    @Length(min = 8, max = 8)
    private String number;

    @NotNull
    @NotEmpty
    @Length(min = 5, max = 255)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User convert(UsersForm usersForm) {
        return new User(name, email, number, password);
    }
}
