package org.tecsup.tecunity_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.tecsup.tecunity_api.model.Participante;
import org.tecsup.tecunity_api.service.IParticipanteService;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class ParticipanteController {

    @Autowired
    @Qualifier(value = "participanteService")
    private IParticipanteService iParticipanteService;

    @GetMapping(value = {"/participantes"})
    List<Participante> showAll() {
        return this.iParticipanteService.findAll();
    }

    @GetMapping(value = {"/participante/{id}"})
    Participante showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iParticipanteService.findById(id);
    }

    @PostMapping(value = {"/participante"})
    @ResponseStatus(HttpStatus.CREATED)
    Participante create(@RequestBody Participante participante) {
        this.iParticipanteService.save(participante);
        return participante;
    }

    @PutMapping(value = {"/participante/{id}"})
    Participante update(@RequestBody Participante participante, @PathVariable(value = "id") Integer id) {
        Participante currentParticipante = this.iParticipanteService.findById(id);
        currentParticipante.setUsuario(participante.getUsuario());
        currentParticipante.setCiclo(participante.getCiclo());
        this.iParticipanteService.save(currentParticipante);
        return currentParticipante;
    }

    @DeleteMapping(value = {"/participante/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Participante participante = this.iParticipanteService.findById(id);
        this.iParticipanteService.delete(participante);

    }

}
