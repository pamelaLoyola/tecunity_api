package org.tecsup.tecunity_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.tecunity_api.model.Asesoria;

@Repository(value = "asesoriaRepository")
public interface AsesoriaRepository extends JpaRepository<Asesoria, Integer> {
}
