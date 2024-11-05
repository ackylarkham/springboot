package com.example.sample.domain.user.model;

import java.util.Date;
import lombok.Data;

@Data
public class MUser {

    private String UserId;
    private String Password;
    private String userName;
    private Date dateOfBirth;
    private Integer gender;
    private Integer departmentId;
    private String role;
    private Department department;
}
