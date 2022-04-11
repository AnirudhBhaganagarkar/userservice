package com.cygnet.user.userservice.dto;

import com.cygnet.user.userservice.model.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate
{
    private Users users;
    private Departement departement;
}
