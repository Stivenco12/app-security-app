package com.crudsec.app_security_app.application.services;

import java.util.List;
import com.crudsec.app_security_app.domain.entity.Role;

public interface IRoleService {
    List<Role> findAll();
    Role save(Role role);
} 
