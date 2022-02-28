package in.module.logIn.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "registered_user")
public class RegisteredUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String password;

    @OneToOne(targetEntity = User.class,fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id")
    private User user;



    public RegisteredUser(String email, String password, User user) {
        this.email = email;
        this.password = password;
        this.user = user;
    }


}
