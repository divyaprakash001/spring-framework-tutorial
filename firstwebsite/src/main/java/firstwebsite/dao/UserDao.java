package firstwebsite.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import firstwebsite.model.User;

@Component
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

//	create user
	@Transactional
	public void createUser(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}

	@Transactional
	public void deleteUser(int id) {
		User user = this.hibernateTemplate.get(User.class, id);
		this.hibernateTemplate.delete(user);
	}

	public List<User> getAllUsers() {
		List<User> users = this.hibernateTemplate.loadAll(User.class);
		return users;
	}

}
