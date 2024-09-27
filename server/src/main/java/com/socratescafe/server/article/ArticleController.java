package com.socratescafe.server.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/api/articles")
    public ResponseEntity<Iterable<Article>> findAll() {
        Iterable<Article> articles = articleRepository.findAll();
        return new ResponseEntity<Iterable<Article>>(articles, HttpStatus.OK);
    }

    @PutMapping("/api/articles")
    public ResponseEntity<Article> updateOne(@RequestBody Article article) {
        Article updatedArticle = articleRepository.save(article);
        return new ResponseEntity<Article>(updatedArticle, HttpStatus.OK);
    }

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addOne(@RequestBody Article article) {
        Article newArticle = articleRepository.save(article);
        return new ResponseEntity<Article>(newArticle, HttpStatus.OK);
    }

    @DeleteMapping("/api/articles/{id}")
    public ResponseEntity<Integer> deleteOne(@PathVariable long id) {
        return new ResponseEntity<Integer>(articleRepository.deleteOne(id), HttpStatus.OK);
    }
}
