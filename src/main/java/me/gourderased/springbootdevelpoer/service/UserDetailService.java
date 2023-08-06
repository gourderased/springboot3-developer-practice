package me.gourderased.springbootdevelpoer.service;

import lombok.RequiredArgsConstructor;
import me.gourderased.springbootdevelpoer.domain.User;
import me.gourderased.springbootdevelpoer.reository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService{

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
            .orElseThrow(() -> new IllegalArgumentException((email)));
    }
}
