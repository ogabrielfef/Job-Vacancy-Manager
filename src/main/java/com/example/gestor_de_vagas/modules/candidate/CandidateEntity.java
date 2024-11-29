package com.example.gestor_de_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {
    
    private UUID id;
    private String name;
    
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaços.")
    private String username;
    
    @Email(message = "O campo [email] de conter um e-mail válido.")
    private String email;
    
    @Length(min = 8, message = "A senha deve ter no minimo 8 caracteres.")
    private String password;
    private String description;
    private String curriculum;

}
