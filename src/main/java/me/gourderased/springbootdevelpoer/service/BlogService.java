package me.gourderased.springbootdevelpoer.service;

import lombok.RequiredArgsConstructor;
import me.gourderased.springbootdevelpoer.domain.Article;
import me.gourderased.springbootdevelpoer.dto.AddArticleRequest;
import me.gourderased.springbootdevelpoer.reository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
