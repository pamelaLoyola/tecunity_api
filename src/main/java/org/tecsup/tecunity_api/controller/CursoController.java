package org.tecsup.tecunity_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.tecsup.tecunity_api.model.Curso;
import org.tecsup.tecunity_api.service.ICursoService;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class CursoController {

    @Autowired
    @Qualifier(value = "cursoService")
    private ICursoService iCursoService;

    @GetMapping(value = {"/cursos"})
    List<Curso> showAll() {
        return this.iCursoService.findAll();
    }

    @GetMapping(value = {"/curso/{id}"})
    Curso showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iCursoService.findById(id);
    }

    @PostMapping(value = {"/curso"})
    @ResponseStatus(HttpStatus.CREATED)
    Curso create(@RequestBody Curso curso) {
        this.iCursoService.save(curso);
        return curso;
    }

    @PutMapping(value = {"/curso/{id}"})
    Curso update(@RequestBody Curso curso, @PathVariable(value = "id") Integer id) {
        Curso currentCurso = this.iCursoService.findById(id);
        //currentParticipante.setUsuario(participante.getUsuario());
        //currentParticipante.setCiclo(participante.getCiclo());
        this.iCursoService.save(currentCurso);
        return currentCurso;
    }

    @DeleteMapping(value = {"/curso/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Curso curso = this.iCursoService.findById(id);
        this.iCursoService.delete(curso);

    }

}
