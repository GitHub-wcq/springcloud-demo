package com.forezp.helloworld.dao;

import com.forezp.helloworld.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
