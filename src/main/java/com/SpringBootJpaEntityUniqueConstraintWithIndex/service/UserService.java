package com.SpringBootJpaEntityUniqueConstraintWithIndex.service;


import com.SpringBootJpaEntityUniqueConstraintWithIndex.entity.User;
import com.SpringBootJpaEntityUniqueConstraintWithIndex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public User getUser(Long primaryKey){
        return userRepository.findById(primaryKey).get();
    }
}
