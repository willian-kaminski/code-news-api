package br.com.kaminski.codenews.controller.form;

import br.com.kaminski.codenews.domain.User;

public class UsersForm {

    private String name;
    private String email;
    private String number;
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
