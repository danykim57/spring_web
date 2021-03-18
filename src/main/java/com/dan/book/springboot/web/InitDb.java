package com.dan.book.springboot.web;

import com.dan.book.springboot.domain.posts.Posts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitDb {
    //private final InitService initService;
    //@PostConstruct
    //public void init() {
    //    initService.dbInit();
    //}
//
    //@Component
    //@Transactional
    //@RequiredArgsConstructor
    //static class InitService {
    //    private final EntityManager em;
    //    public void dbInit() {
    //        for (int i = 1; i < 15; i++) {
    //            String count = Integer.toString(i);
    //            Posts post = createPost(count,count, count);
    //            em.persist(post);
    //        }
//
    //    }
//
    //    private Posts createPost(String title, String content, String author) {
    //        Posts post = new Posts();
    //        post.setTitle(title);
    //        post.setContent(content);
    //        post.setAuthor(author);
    //        return post;
    //    }
    //}
}
