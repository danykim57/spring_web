package com.dan.book.springboot.web.dto;

import com.dan.book.springboot.domain.posts.Posts;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PagingDTO {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PagingDTO(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
