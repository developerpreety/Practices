package in.module.logIn.services;

import in.module.logIn.entity.RegisteredUser;
import in.module.logIn.entity.User;
import in.module.logIn.exception.UserAlreadyRegistered;
import in.module.logIn.exception.WrongPasswordException;
import in.module.logIn.repository.RegisteredUserRepository;
import in.module.logIn.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    RegisteredUserRepository registeredUserRepository;


    RegisteredUser registeredUser;
    String s = "Log in successful";


    public User register(User user) {
        return userRepository.save(user);
    }

    public String logIn(User user) {
        /*if ((user.getEmail().equals(null)  & (user.getEmail().equals(""))) )
              throw new BadCredentialsException();
        else if((user.getPassword().equals(null)) && user.getPassword().equals(""))
            throw new BadCredentialsException();

*/
        for(User u1:getUser())
            if(u1.getEmail().equals(user.getEmail()))
                throw new UserAlreadyRegistered();
            else if(u1.getPassword().equals(user.getPassword()))
                throw new WrongPasswordException();
        return s;
    }
    public List<User> getUser(){
        return userRepository.findAll();
    }

}


