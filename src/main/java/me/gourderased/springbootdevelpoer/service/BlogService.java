package me.gourderased.springbootdevelpoer.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.gourderased.springbootdevelpoer.domain.Article;
import me.gourderased.springbootdevelpoer.dto.AddArticleRequest;
import me.gourderased.springbootdevelpoer.dto.UpdateArticleRequest;
import me.gourderased.springbootdevelpoer.reository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(Long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }
}
