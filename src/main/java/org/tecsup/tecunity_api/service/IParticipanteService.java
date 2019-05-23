package org.tecsup.tecunity_api.service;

import org.tecsup.tecunity_api.model.Participante;

import java.util.List;

public interface IParticipanteService {

    List<Participante> findAll();

    Participante findById(Integer id);

    void save(Participante participante);

    void delete(Participante participante);
}
