package com.example.crudboot.repository;

import com.example.crudboot.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long > {
}
