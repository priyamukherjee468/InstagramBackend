package com.example.Instagram.Backend.Service;

import com.example.Instagram.Backend.Repository.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    IAdminRepo adminRepo;
}
