package com.cygnet.user.userservice.controller;

import com.cygnet.user.userservice.dto.ResponseTemplate;
import com.cygnet.user.userservice.model.Users;
import com.cygnet.user.userservice.service.UserServoce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserServoce userServoce;

    @PostMapping("/")
    public Users saveUser(@RequestBody Users user)
    {
        return userServoce.saveUser(user);
    }

  /*  @GetMapping("/{id}")
    public Users findUserById(@PathVariable("id") Long usersid)
    {
        return userServoce.findUserById(usersid);
    }
*/
    @GetMapping("/{id}")
    public ResponseTemplate getUserDepartement(@PathVariable("id") Long usersid)
    {
        return userServoce.getUserDepartement(usersid);
    }
}
