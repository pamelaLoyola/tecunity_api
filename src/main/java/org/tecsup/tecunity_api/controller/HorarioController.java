package org.tecsup.tecunity_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.tecsup.tecunity_api.model.Horario;
import org.tecsup.tecunity_api.service.IHorarioService;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class HorarioController {

    @Autowired
    @Qualifier(value = "horarioService")
    private IHorarioService iHorarioService;

    @GetMapping(value = {"/horarios"})
    List<Horario> showAll() {
        return this.iHorarioService.findAll();
    }

    @GetMapping(value = {"/horario/{id}"})
    Horario showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iHorarioService.findById(id);
    }

    @PostMapping(value = {"/horario"})
    @ResponseStatus(HttpStatus.CREATED)
    Horario create(@RequestBody Horario horario) {
        this.iHorarioService.save(horario);
        return horario;
    }

    @PutMapping(value = {"/horario/{id}"})
    Horario update(@RequestBody Horario horario, @PathVariable(value = "id") Integer id) {
        Horario currentHorario = this.iHorarioService.findById(id);
        //currentParticipante.setUsuario(participante.getUsuario());
        //currentParticipante.setCiclo(participante.getCiclo());
        this.iHorarioService.save(currentHorario);
        return currentHorario;
    }

    @DeleteMapping(value = {"/horario/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Horario horario = this.iHorarioService.findById(id);
        this.iHorarioService.delete(horario);

    }

}
