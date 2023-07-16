package com.example.Instagram.Backend.Repository;

import com.example.Instagram.Backend.Model.Like;
import com.example.Instagram.Backend.Model.Post;
import com.example.Instagram.Backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ILikeRepo extends JpaRepository<Like,Integer> {
    List<Like> findByInstaPostAndLiker(Post instaPost, User liker);

    Collection<Object> findByInstaPost(Post validPost);
}
