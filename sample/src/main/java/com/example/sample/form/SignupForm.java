package com.example.sample.form;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class SignupForm {
    @NotBlank
    @Email
    private String userId;

    @NotBlank
    @Length(min = 8, max = 100)
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    private String password;

    @NotBlank
    private String userName;
    
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    @NotNull
    private Date dateOfBirth;

    @NotNull
    private Integer gender;
}