package com.disaster.alert.recovery.disaster.apps.entity;


import com.disaster.alert.recovery.disaster.apps.custom_annotation.ValidPassword;
import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserRegister {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min=2, max=30)
    private String firstName;

    @NotEmpty
    @Size(min=3, max = 50)
    private String lastName;

    @NotEmpty
    @Email
    @Size(max = 100, message = "Invalid Email Input")
    private String email;

    @NotEmpty
    @Size(min=8, max = 100)
    @ValidPassword
    private String password;

}
