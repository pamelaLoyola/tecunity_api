package org.tecsup.tecunity_api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tecsup.tecunity_api.model.Participante;
import org.tecsup.tecunity_api.repository.ParticipanteRepository;
import org.tecsup.tecunity_api.service.IParticipanteService;

import java.util.List;

@Service(value = "participanteService")
public class ParticipanteService implements IParticipanteService {

    @Autowired
    @Qualifier(value = "participanteRepository")
    private ParticipanteRepository participanteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Participante> findAll() {
        return this.participanteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Participante findById(Integer id) {
        return this.participanteRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Participante participante) {
        this.participanteRepository.save(participante);
    }

    @Override
    @Transactional
    public void delete(Participante participante) {
        this.participanteRepository.delete(participante);
    }
}
