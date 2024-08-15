package com.academy.sirma.RestDbApp.Controller;

import com.academy.sirma.RestDbApp.Models.Article;
import com.academy.sirma.RestDbApp.Services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

@RestController
@RequestMapping("/articles")
public class ArticleController {


    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createArticle(@RequestBody Article article){
        try {
            articleService.add(article);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("Success");
    }
}
