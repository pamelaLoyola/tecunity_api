package org.tecsup.tecunity_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.tecunity_api.model.Curso;

@Repository(value = "cursoRepository")
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
