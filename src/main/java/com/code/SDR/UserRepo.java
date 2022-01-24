package com.code.SDR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.code.SDR.model.User;

@RepositoryRestResource(collectionResourceRel = "users", path="users")
public interface UserRepo extends JpaRepository<User, Integer>{
	
}
