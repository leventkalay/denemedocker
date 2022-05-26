package com.example.dockerdeneme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private IUserRepository userRepository;

    public User saveUser(User user)
    {
        return userRepository.save(user);
    }
}
