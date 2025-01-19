

package com.example.project.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.User;
import com.example.project.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class UserController {
 @Autowired
   private UserService service;

   @PostMapping("register")
   public User register(@RequestBody User user){
    return service.saveUser(user);


 }




}
