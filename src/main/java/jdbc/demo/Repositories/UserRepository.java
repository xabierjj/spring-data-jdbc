package jdbc.demo.Repositories;

import jdbc.demo.Models.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel,Long> {

    
}