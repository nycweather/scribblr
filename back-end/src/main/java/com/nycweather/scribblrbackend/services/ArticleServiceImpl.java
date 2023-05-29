package com.nycweather.scribblrbackend.services;

import com.nycweather.scribblrbackend.repositories.ArticleRepository;

import com.nycweather.scribblrbackend.models.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article getArticleById(Long articleId) {
        return articleRepository.findById(articleId).get();
    }
}
