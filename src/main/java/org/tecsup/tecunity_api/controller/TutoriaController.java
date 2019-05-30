package org.tecsup.tecunity_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.tecsup.tecunity_api.model.Tutoria;
import org.tecsup.tecunity_api.service.ITutoriaService;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class TutoriaController {

    @Autowired
    @Qualifier(value = "tutoriaService")
    private ITutoriaService iTutoriaService;

    @GetMapping(value = {"/tutorias"})
    List<Tutoria> showAll() {
        return this.iTutoriaService.findAll();
    }

    @GetMapping(value = {"/tutoria/{id}"})
    Tutoria showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iTutoriaService.findById(id);
    }

    @PostMapping(value = {"/tutoria"})
    @ResponseStatus(HttpStatus.CREATED)
    Tutoria create(@RequestBody Tutoria tutoria) {
        this.iTutoriaService.save(tutoria);
        return tutoria;
    }

    @PutMapping(value = {"/tutoria/{id}"})
    Tutoria update(@RequestBody Tutoria tutoria, @PathVariable(value = "id") Integer id) {
        Tutoria currentTutoria = this.iTutoriaService.findById(id);
        currentTutoria.setTitulo(tutoria.getTitulo());
        currentTutoria.setDescripcion(tutoria.getDescripcion());
        currentTutoria.setTipo(tutoria.getTipo());
        currentTutoria.setEtiquetas(tutoria.getEtiquetas());
        currentTutoria.setEstado(tutoria.getEstado());
        this.iTutoriaService.save(currentTutoria);
        return currentTutoria;
    }

    @DeleteMapping(value = {"/tutoria/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Tutoria tutoria = this.iTutoriaService.findById(id);
        this.iTutoriaService.delete(tutoria);
    }
}
