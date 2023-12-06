package kz.bitlab.graphql.middle01graphql.repository;

import kz.bitlab.graphql.middle01graphql.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
