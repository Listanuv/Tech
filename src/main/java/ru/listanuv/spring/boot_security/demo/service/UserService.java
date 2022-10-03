package ru.listanuv.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import ru.listanuv.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    void save(User user);

    void deleteById(Long id);

    List<User> findAll();

    UserDetails loadUserByUsername(String username);
}
