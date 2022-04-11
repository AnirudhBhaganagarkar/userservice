package com.cygnet.user.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departement
{

    private long id;
    private String departementName;
    private String departementAddress;
    private String departementCode;
}
