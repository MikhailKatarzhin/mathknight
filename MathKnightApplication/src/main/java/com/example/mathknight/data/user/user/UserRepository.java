package com.example.mathknight.data.user.user;

import com.example.mathknight.domain.model.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    long countByEmail(String email);

    Optional<User> findAllByEmail(String email);
    Optional<User> findByEmailAndEnabledTrue(String username);
}
