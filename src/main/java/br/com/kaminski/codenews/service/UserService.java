package br.com.kaminski.codenews.service;

import br.com.kaminski.codenews.controller.form.UsersForm;
import br.com.kaminski.codenews.domain.User;
import br.com.kaminski.codenews.domain.dto.UserDto;
import br.com.kaminski.codenews.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> listAll(){
        List<User> users = userRepository.findAll();
        return UserDto.convertUser(users);
    }

    public User register(UsersForm usersForm){
        User user = usersForm.convert(usersForm);

        if(userRepository.existsByEmail(usersForm.getEmail())){
            throw new RuntimeException("Email already registred.");
        }
        
        userRepository.save(user);
        return user;
    }

}
