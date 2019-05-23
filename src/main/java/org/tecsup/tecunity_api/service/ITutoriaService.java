package org.tecsup.tecunity_api.service;

import org.tecsup.tecunity_api.model.Tutoria;

import java.util.List;

public interface ITutoriaService {

    List<Tutoria> findAll();

    Tutoria findById(Integer id);

    void save(Tutoria tutoria);

    void delete(Tutoria tutoria);
}
