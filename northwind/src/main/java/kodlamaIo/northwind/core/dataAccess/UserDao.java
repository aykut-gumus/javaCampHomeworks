package kodlamaIo.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaIo.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}
