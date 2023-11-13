package springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.dao.UserDao;
import springMVC.model.User;

@Service  //use for service class
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public Integer saveUser(User user) {
		return this.userDao.saveUser(user);
	}
	
}
