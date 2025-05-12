package com.crudsec.app_security_app.infrastructure.repositories.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleAdapter {
    @Autowired
    private RoleRepository roleRepository;
}
