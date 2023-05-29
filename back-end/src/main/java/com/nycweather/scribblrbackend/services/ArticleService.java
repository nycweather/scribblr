package com.nycweather.scribblrbackend.services;

import com.nycweather.scribblrbackend.models.Article;

import java.util.Map;

public interface ArticleService {
    Article saveArticle(Article article);

    Article getArticleById(Long articleId);

}
