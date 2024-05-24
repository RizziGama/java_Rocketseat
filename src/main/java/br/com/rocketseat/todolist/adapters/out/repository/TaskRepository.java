package br.com.rocketseat.todolist.adapters.out.repository;

import br.com.rocketseat.todolist.application.core.domain.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskModel, UUID> {

    List<TaskModel> findByIdUser(UUID idUser);
   // TaskModel findByIdAndIdUser(UUID id, UUID idUser);
}
