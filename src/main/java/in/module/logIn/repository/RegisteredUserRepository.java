package in.module.logIn.repository;

import in.module.logIn.entity.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface RegisteredUserRepository extends JpaRepository<RegisteredUser,Integer> {

}
