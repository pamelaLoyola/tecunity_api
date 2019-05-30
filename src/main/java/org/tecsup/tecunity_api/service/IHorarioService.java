package org.tecsup.tecunity_api.service;

import org.tecsup.tecunity_api.model.Horario;

import java.util.List;

public interface IHorarioService {

    List<Horario> findAll();

    Horario findById(Integer id);

    void save(Horario horario);

    void delete(Horario horario);
}
