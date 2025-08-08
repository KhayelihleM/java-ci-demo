package com.example.portfolio.controller;

import com.example.portfolio.model.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Your Name");
        return "index";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        List<BlogPost> posts = List.of(
            new BlogPost("Welcome to My Blog", "This is the first post!", LocalDateTime.now())
        );
        model.addAttribute("posts", posts);
        return "blog";
    }
}
