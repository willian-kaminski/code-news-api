package br.com.kaminski.codenews.controller;

import br.com.kaminski.codenews.controller.dto.UserDto;
import br.com.kaminski.codenews.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users")
    public List<UserDto> listAll(){
        return UserDto.convertUser(userRepository.findAll());
    }
}
