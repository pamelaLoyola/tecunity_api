package org.tecsup.tecunity_api.service;

import org.tecsup.tecunity_api.model.Asesoria;

import java.util.List;

public interface IAsesoriaService {

    List<Asesoria> findAll();

    Asesoria findById(Integer id);

    void save(Asesoria asesoria);

    void delete(Asesoria asesoria);
}
