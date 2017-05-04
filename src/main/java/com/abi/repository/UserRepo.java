package com.abi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.abi.entity.User;

public interface UserRepo extends CrudRepository<User,Integer>{

	@Query(value = "select us from User us")
	List<User> getAlluserData();

}
