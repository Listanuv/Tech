package ru.listanuv.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.listanuv.spring.boot_security.demo.model.Role;
import ru.listanuv.spring.boot_security.demo.repositories.RoleRepository;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRole(Long id) {
        return roleRepository.findById(id).orElseThrow();
    }
}
