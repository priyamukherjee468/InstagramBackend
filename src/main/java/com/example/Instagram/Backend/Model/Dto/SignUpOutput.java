package com.example.Instagram.Backend.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignUpOutput {

    private boolean signUpStatus;
    private String signUpStatusMessage;
}
