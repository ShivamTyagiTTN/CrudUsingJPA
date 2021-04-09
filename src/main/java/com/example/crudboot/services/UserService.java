package com.example.crudboot.services;

import com.example.crudboot.domain.User;
import com.example.crudboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createUser(String name){

        User user = new User(name);
        userRepository.save(user);
    }

    public void deleteUser(String name){

        User user = new User(name);
        userRepository.delete(user);
    }

    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent())
            return user.get();

        return null;
    }
}
