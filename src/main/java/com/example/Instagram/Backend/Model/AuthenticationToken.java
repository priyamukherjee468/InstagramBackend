package com.example.Instagram.Backend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long Token_Id;
    private String Token_value;
    private LocalDateTime TokenCreationDateTime;
    @OneToOne
    @JoinColumn(name = "fk.UserId")
    User user;
    public AuthenticationToken(User user){
        this.user=user;
        this.Token_value= UUID.randomUUID().toString();
        this.TokenCreationDateTime=LocalDateTime.now();

    }


    public String getTokenValue() {
        return null;
    }
}
