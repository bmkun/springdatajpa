package com.idho.routingapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.idho.routingapps.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
