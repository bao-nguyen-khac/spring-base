package baonk.springmvcnec.dao;

import java.util.List;

import baonk.springmvcnec.entities.UserEntity;

public interface UserDAO {
	UserEntity getUserById(Long id);

	List<UserEntity> getAllUsers();

	boolean deleteUser(UserEntity user);

	boolean updateUser(UserEntity user);

	boolean createUser(UserEntity user);
}
