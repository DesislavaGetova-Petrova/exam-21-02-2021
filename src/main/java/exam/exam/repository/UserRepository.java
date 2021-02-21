package exam.exam.repository;


import exam.exam.model.entity.User;
import exam.exam.model.service.UserServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

   Optional< User> findByUsername(String userName);

    Optional< User> findByUsernameAndPassword(String username, String password);
}
