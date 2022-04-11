package com.cygnet.user.userservice.service;

import com.cygnet.user.userservice.dto.Departement;
import com.cygnet.user.userservice.dto.ResponseTemplate;
import com.cygnet.user.userservice.model.Users;
import com.cygnet.user.userservice.repository.UsersReporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServoce
{
    @Autowired
    private UsersReporitory userReporitory;

    @Autowired
    private RestTemplate restTemplate;

    public Users saveUser(Users user)
    {
        return userReporitory.save(user);
    }

    public Users findUserById(Long usersid)
    {
        return userReporitory.findById(usersid).get();
    }

    public ResponseTemplate getUserDepartement(Long usersid)
    {
        ResponseTemplate vo = new ResponseTemplate();
        Users users = userReporitory.findById(usersid).get();

        Departement departement = restTemplate.getForObject("http://DEPARTEMENT-SERVICE/departement/" + users.getId(), Departement.class);

        vo.setUsers(users);
        vo.setDepartement(departement);

        return vo;
    }
}
