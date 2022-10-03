package ru.listanuv.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.listanuv.spring.boot_security.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
