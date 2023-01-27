package baonk.springmvcnec.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import baonk.springmvcnec.entities.UserEntity;

@Component
public class UserDAOImpl implements UserDAO {
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_PERSON = "select * from people where id = ?";
	private final String SQL_DELETE_PERSON = "delete from people where id = ?";
	private final String SQL_UPDATE_PERSON = "update people set first_name = ?, last_name = ?, age  = ? where id = ?";
	private final String SQL_GET_ALL = "select * from people";
	private final String SQL_INSERT_PERSON = "insert into public.user(id, username, password) values(?,?,?)";
	
	@Autowired
	public void PersonDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public UserEntity getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
		
	}

	public List<UserEntity> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteUser(UserEntity user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createUser(UserEntity user) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_INSERT_PERSON, user.getId(), user.getUsername(), user.getPassword()) > 0;
	}

}
