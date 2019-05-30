package org.tecsup.tecunity_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.tecunity_api.model.Participante;

@Repository(value = "participanteRepository")
public interface ParticipanteRepository extends JpaRepository<Participante,Integer> {
}
