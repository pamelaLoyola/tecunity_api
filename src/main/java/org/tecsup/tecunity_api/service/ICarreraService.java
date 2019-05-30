package org.tecsup.tecunity_api.service;

import org.tecsup.tecunity_api.model.Carrera;

import java.util.List;

public interface ICarreraService {

    List<Carrera> findAll();

    Carrera findById(Integer id);

    void save(Carrera carrera);

    void delete(Carrera carrera);
}
