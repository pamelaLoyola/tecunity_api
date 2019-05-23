package org.tecsup.tecunity_api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tecsup.tecunity_api.model.Tutoria;
import org.tecsup.tecunity_api.repository.TutoriaRepository;
import org.tecsup.tecunity_api.service.ITutoriaService;

import java.util.List;

@Service(value = "tutoriaService")
public class TutoriaService implements ITutoriaService {

    @Autowired
    private TutoriaRepository tutoriaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Tutoria> findAll() {
        return tutoriaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Tutoria findById(Integer id) {
        return tutoriaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Tutoria tutoria) {
        tutoriaRepository.save(tutoria);
    }

    @Override
    @Transactional
    public void delete(Tutoria tutoria) {
        tutoriaRepository.delete(tutoria);
    }
}
