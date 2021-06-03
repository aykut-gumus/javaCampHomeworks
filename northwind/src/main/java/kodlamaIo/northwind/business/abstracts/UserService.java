package kodlamaIo.northwind.business.abstracts;

import kodlamaIo.northwind.core.entities.User;
import kodlamaIo.northwind.core.utilities.results.DataResult;
import kodlamaIo.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
