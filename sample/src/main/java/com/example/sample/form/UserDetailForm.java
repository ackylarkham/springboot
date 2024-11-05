package com.example.sample.form;

import java.util.Date;
import java.util.List;

import com.example.sample.domain.user.model.Department;
import com.example.sample.domain.user.model.Salary;

import lombok.Data;

@Data
public class UserDetailForm {

    private String userId;
    private String password;
    private String userName;
    private Date dateOfBirth;
    private Integer gender;
    private Department department;
    private List<Salary> salaryList;
}
