package me.gourderased.springbootdeveloper.repository;

import java.util.Optional;
import me.gourderased.springbootdeveloper.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
