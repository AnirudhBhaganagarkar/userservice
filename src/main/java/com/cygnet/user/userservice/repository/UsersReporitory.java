package com.cygnet.user.userservice.repository;

import com.cygnet.user.userservice.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersReporitory extends JpaRepository<Users, Long>
{
}
