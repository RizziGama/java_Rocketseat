package br.com.rocketseat.todolist.adapters.out.repository;

import br.com.rocketseat.todolist.application.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);

}
