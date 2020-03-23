package br.com.kaminski.codenews.controller.dto;

import br.com.kaminski.codenews.domain.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String number;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
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

    public static List<UserDto> convertUser(List<User> users) {
        return users.stream().map(UserDto::new).collect(Collectors.toList());
    }
}
