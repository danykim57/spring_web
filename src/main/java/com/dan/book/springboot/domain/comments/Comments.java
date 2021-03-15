package com.dan.book.springboot.domain.comments;

import com.dan.book.springboot.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Comments {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String title;
    @Column(length = 150, nullable = false)
    private String content;
    @Column(nullable = false)
    private String author;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Posts posts;
}
