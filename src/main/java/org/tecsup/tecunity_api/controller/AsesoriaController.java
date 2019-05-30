package org.tecsup.tecunity_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.tecsup.tecunity_api.model.Asesoria;
import org.tecsup.tecunity_api.service.IAsesoriaService;

import java.util.List;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class AsesoriaController {

    @Autowired
    @Qualifier(value = "asesoriaService")
    private IAsesoriaService iAsesoriaService;

    @GetMapping(value = {"/asesorias"})
    List<Asesoria> showAll() {
        return this.iAsesoriaService.findAll();
    }

    @GetMapping(value = {"/asesoria/{id}"})
    Asesoria showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iAsesoriaService.findById(id);
    }

    @PostMapping(value = {"/asesoria"})
    @ResponseStatus(HttpStatus.CREATED)
    Asesoria create(@RequestBody Asesoria asesoria) {
        this.iAsesoriaService.save(asesoria);
        return asesoria;
    }

    @PutMapping(value = {"/asesoria/{id}"})
    Asesoria update(@RequestBody Asesoria asesoria, @PathVariable(value = "id") Integer id) {
        Asesoria currentAsesoria = this.iAsesoriaService.findById(id);
        //currentAsesoria.setUsuario(participante.getUsuario());
        //currentAsesoria.setCiclo(participante.getCiclo());
        this.iAsesoriaService.save(currentAsesoria);
        return currentAsesoria;
    }

    @DeleteMapping(value = {"/asesoria/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Asesoria asesoria = this.iAsesoriaService.findById(id);
        this.iAsesoriaService.delete(asesoria);

    }
}
