package in.module.logIn.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String FirstName;
    private String LastName;
    private String Username;
    private String Email;
    private String Password;
    private String Status;


    public User(String username, String password, String firstName, String lastName, String status, String email) {
        Username = username;
        Password = password;
        FirstName = firstName;
        LastName = lastName;
        Status = status;
        Email=email;
    }

}

