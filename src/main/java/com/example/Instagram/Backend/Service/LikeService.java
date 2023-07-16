package com.example.Instagram.Backend.Service;

import com.example.Instagram.Backend.Model.Like;
import com.example.Instagram.Backend.Model.Post;
import com.example.Instagram.Backend.Model.User;
import com.example.Instagram.Backend.Repository.ICommentRepo;
import com.example.Instagram.Backend.Repository.ILikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class LikeService {

    @Autowired
    ILikeRepo likeRepo;

    public String addLike(Like like) {

        likeRepo.save(like);
        return "Insta post liked successfully!!!";

    }

    public boolean isLikeAllowedOnThisPost(Post instaPost, User liker) {

        List<Like> likeList = likeRepo.findByInstaPostAndLiker(instaPost,liker);
        return likeList!=null && likeList.isEmpty();
    }

    public Integer getLikeCountForPost(Post validPost) {
        return likeRepo.findByInstaPost(validPost).size();
    }


    public Like findLike(Integer likeId) {
        return likeRepo.findById(likeId).orElse(null);
    }

    public void removeLike(Like like) {
        likeRepo.delete(like);
    }
}
