package com.example.Instagram.Backend.Repository;

import com.example.Instagram.Backend.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
