package com.dan.book.springboot.service.posts;

import com.dan.book.springboot.domain.posts.Posts;
import com.dan.book.springboot.domain.posts.PostsRepository;
import com.dan.book.springboot.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {

    @Autowired
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    public PostsResponseDto findById (Long id) {
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<PostsListResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().stream()
                .map(entity -> new PostsListResponseDto(entity))
                .collect(Collectors.toList());
    }

    @Transactional
    public void delete (Long id) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        postsRepository.delete(posts);
    }

    @Transactional(readOnly = true)
    public Boolean getListCheck(Pageable pageable) {
        Page<Posts> saved = getPostsList(pageable);
        Boolean check = saved.hasNext();

        return check;
    }

    @Transactional
    public Page<Posts> getPostsList(Pageable pageable) {
        return postsRepository.findAll(pageable);
    }

    @Transactional
    public Page<Posts> search(String keyword, Pageable pageable) {
        Page<Posts> postsList = postsRepository.findByTitle(keyword, pageable);

        return postsList;
    }


}
