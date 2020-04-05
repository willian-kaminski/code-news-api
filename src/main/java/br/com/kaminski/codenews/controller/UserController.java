package br.com.kaminski.codenews.controller;

import br.com.kaminski.codenews.domain.dto.UserDetailDto;
import br.com.kaminski.codenews.domain.form.UsersForm;
import br.com.kaminski.codenews.domain.User;
import br.com.kaminski.codenews.domain.dto.UserDto;
import br.com.kaminski.codenews.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    private List<UserDto> listAll(){
        return userService.listAll();
    }

    @PostMapping
    private ResponseEntity<UserDto> register(@Valid @RequestBody UsersForm usersForm){
        User user = userService.register(usersForm);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(new UserDto(user));
    }

    @GetMapping("/{id}")
    public UserDetailDto detail(@PathVariable Long id){
        return userService.detail(id);
    }

}
