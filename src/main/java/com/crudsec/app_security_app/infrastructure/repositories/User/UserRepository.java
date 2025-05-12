package com.crudsec.app_security_app.infrastructure.repositories.User;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.crudsec.app_security_app.domain.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}