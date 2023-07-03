package me.gourderased.springbootdevelpoer.reository;

import me.gourderased.springbootdevelpoer.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
