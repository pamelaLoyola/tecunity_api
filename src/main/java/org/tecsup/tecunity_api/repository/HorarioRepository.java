package org.tecsup.tecunity_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.tecunity_api.model.Horario;

@Repository(value = "horarioRepository")
public interface HorarioRepository extends JpaRepository<Horario, Integer> {

}
