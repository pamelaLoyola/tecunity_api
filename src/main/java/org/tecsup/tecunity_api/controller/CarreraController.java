package org.tecsup.tecunity_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.tecsup.tecunity_api.model.Carrera;
import org.tecsup.tecunity_api.service.ICarreraService;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class CarreraController {

    @Autowired
    @Qualifier(value = "carreraService")
    private ICarreraService iCarreraService;

    @GetMapping(value = {"/carreras"})
    List<Carrera> showAll() {
        return this.iCarreraService.findAll();
    }

    @GetMapping(value = {"/carrera/{id}"})
    Carrera showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iCarreraService.findById(id);
    }

    @PostMapping(value = {"/carrera"})
    @ResponseStatus(HttpStatus.CREATED)
    Carrera create(@RequestBody Carrera carrera) {
        this.iCarreraService.save(carrera);
        return carrera;
    }

    @PutMapping(value = {"/carrera/{id}"})
    Carrera update(@RequestBody Carrera carrera, @PathVariable(value = "id") Integer id) {
        Carrera currentCarrera = this.iCarreraService.findById(id);
        //currentParticipante.setUsuario(participante.getUsuario());
        //currentParticipante.setCiclo(participante.getCiclo());
        this.iCarreraService.save(currentCarrera);
        return currentCarrera;
    }

    @DeleteMapping(value = {"/carrera/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Carrera carrera = this.iCarreraService.findById(id);
        this.iCarreraService.delete(carrera);

    }
}
