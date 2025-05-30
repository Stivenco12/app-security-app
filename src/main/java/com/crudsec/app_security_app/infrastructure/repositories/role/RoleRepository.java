package com.crudsec.app_security_app.infrastructure.repositories.role;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.crudsec.app_security_app.domain.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
    Optional<Role> findByName(String name);
}
