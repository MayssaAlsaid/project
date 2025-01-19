package com.example.project.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.project.Model.User;




@Service
public class UserService {

    @Autowired
    private com.example.project.dao.UserRepo repo ;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

}
