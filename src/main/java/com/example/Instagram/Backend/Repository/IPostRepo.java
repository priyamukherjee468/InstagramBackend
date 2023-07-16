package com.example.Instagram.Backend.Repository;


import com.example.Instagram.Backend.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends JpaRepository<Post,Integer> {
}
