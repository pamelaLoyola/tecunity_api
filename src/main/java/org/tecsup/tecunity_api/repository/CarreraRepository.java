package org.tecsup.tecunity_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.tecunity_api.model.Carrera;

@Repository(value = "carreraRepository")
public interface CarreraRepository extends JpaRepository<Carrera, Integer> {
}
