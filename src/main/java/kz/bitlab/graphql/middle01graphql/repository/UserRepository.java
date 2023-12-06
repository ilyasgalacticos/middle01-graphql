package kz.bitlab.graphql.middle01graphql.repository;

import kz.bitlab.graphql.middle01graphql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
