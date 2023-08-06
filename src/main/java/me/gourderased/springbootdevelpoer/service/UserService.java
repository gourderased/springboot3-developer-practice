package me.gourderased.springbootdevelpoer.service;

import lombok.RequiredArgsConstructor;
import me.gourderased.springbootdevelpoer.domain.User;
import me.gourderased.springbootdevelpoer.dto.AddUserRequest;
import me.gourderased.springbootdevelpoer.reository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
            .email(dto.getEmail())
            .password(bCryptPasswordEncoder.encode(dto.getPassword()))
            .build()).getId();
    }
}
