package in.module.logIn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Controlleradvice {
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<String> exception(BadCredentialsException e){
        return new ResponseEntity<>("Bad Credentials, Please provide valid credentials",
                HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(UserAlreadyRegistered.class)
    public ResponseEntity<String> userAlreadyRegistered(UserAlreadyRegistered e){
        return new ResponseEntity<>("User Already Registered, Please log in",HttpStatus.ALREADY_REPORTED);
    }
    @ExceptionHandler(WrongPasswordException.class)
    public ResponseEntity<String> wrongPassword(WrongPasswordException e){
        return new ResponseEntity<>("Wrong Password", HttpStatus.BAD_REQUEST);
    }

}
