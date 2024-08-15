package com.academy.sirma.RestDbApp.Services;

import com.academy.sirma.RestDbApp.Models.Article;
import com.academy.sirma.RestDbApp.Repositories.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void add(Article article){
        articleRepository.saveArticle(article);
    }
}
