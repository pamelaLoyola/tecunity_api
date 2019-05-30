package org.tecsup.tecunity_api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tecsup.tecunity_api.model.Horario;
import org.tecsup.tecunity_api.repository.HorarioRepository;
import org.tecsup.tecunity_api.service.IHorarioService;

import java.util.List;

@Service(value = "horarioService")
public class HorarioService implements IHorarioService {

    @Autowired
    @Qualifier(value = "horarioRepository")
    private HorarioRepository horarioRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Horario> findAll() {
        return this.horarioRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Horario findById(Integer id) {
        return this.horarioRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void save(Horario horario) {
        this.horarioRepository.save(horario);
    }

    @Transactional
    @Override
    public void delete(Horario horario) {
        this.horarioRepository.delete(horario);
    }
}
