package repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import User.User;


//@ComponentScan(basePackageClasses = User.class)
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
