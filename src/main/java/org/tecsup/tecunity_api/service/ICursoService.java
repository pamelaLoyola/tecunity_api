package org.tecsup.tecunity_api.service;

import org.tecsup.tecunity_api.model.Curso;

import java.util.List;

public interface ICursoService {

    List<Curso> findAll();

    Curso findById(Integer id);

    void save(Curso curso);

    void delete(Curso curso);
}
