package br.com.kaminski.codenews.domain.dto;

import br.com.kaminski.codenews.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserDetailDto {

    private Long id;
    private String name;
    private String email;
    private String number;
    private boolean valid;

    public UserDetailDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.number = user.getNumber();
        this.valid = user.isValid();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public boolean isValid() {
        return valid;
    }

}
