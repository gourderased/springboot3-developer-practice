package me.gourderased.springbootdevelpoer.controller;

import lombok.RequiredArgsConstructor;
import me.gourderased.springbootdevelpoer.domain.Article;
import me.gourderased.springbootdevelpoer.dto.AddArticleRequest;
import me.gourderased.springbootdevelpoer.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }
}
