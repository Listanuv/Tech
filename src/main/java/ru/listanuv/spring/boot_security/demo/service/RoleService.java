package ru.listanuv.spring.boot_security.demo.service;

import ru.listanuv.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAllRole();

    Role findRole(Long id);
}
