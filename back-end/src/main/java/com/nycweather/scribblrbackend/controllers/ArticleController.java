package com.nycweather.scribblrbackend.controllers;

import com.nycweather.scribblrbackend.models.Article;
import com.nycweather.scribblrbackend.services.ArticleService;
import com.nycweather.scribblrbackend.services.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/api/articles")
    public Article saveArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }

    @GetMapping("/api/articles/{id}")
    public Article getArticleById(@PathVariable("id") Long articleId) {
        return articleService.getArticleById(articleId);
    }

}
