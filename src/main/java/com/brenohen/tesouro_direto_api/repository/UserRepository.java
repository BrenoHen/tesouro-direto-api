package com.brenohen.tesouro_direto_api.repository;

import com.brenohen.tesouro_direto_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
