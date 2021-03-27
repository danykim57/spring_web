package com.dan.book.springboot.web;

import com.dan.book.springboot.config.auth.LoginUser;
import com.dan.book.springboot.config.auth.dto.SessionUser;
import com.dan.book.springboot.domain.posts.Posts;
import com.dan.book.springboot.service.posts.PostsService;
import com.dan.book.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class ViewController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user, @PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

        model.addAttribute("posts", postsService.getPostsList(pageable));
        model.addAttribute("previous", pageable.previousOrFirst().getPageNumber());
        model.addAttribute("next", pageable.next().getPageNumber());
        model.addAttribute("check",postsService.getListCheck(pageable));

        if (user != null) {
            model.addAttribute("userName", user.getName());
        }

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }

    @GetMapping("/search/*")
    public String searchResult(String keyword, @PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable, Model model) {
        Page<Posts> searchResult = postsService.search(keyword, pageable);

        model.addAttribute("searchList", searchResult);
        model.addAttribute("previous", pageable.previousOrFirst().getPageNumber());
        model.addAttribute("next", pageable.next().getPageNumber());
        model.addAttribute("check",postsService.getListCheck(pageable));
        return "search-result";
    }
}
