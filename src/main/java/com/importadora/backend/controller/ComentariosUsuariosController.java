package com.importadora.backend.controller;

import com.importadora.backend.bo.ComentariosUsuarios;
import com.importadora.backend.service.ComentariosUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value="/comentariosUsuarios", produces = { "application/json" })
public class ComentariosUsuariosController {

    @Autowired
    private final ComentariosUsuariosService service;

    public ComentariosUsuariosController(ComentariosUsuariosService service) {
        this.service = service;
    }

    public ComentariosUsuariosService getService() {return service;}


    @GetMapping
    @ResponseBody
    public List<ComentariosUsuarios> getAll(){
        List<ComentariosUsuarios> lst = service.getAll();
        return lst;
    }

    @GetMapping(path = "/getById")
    @ResponseBody
    public ComentariosUsuarios getById(@RequestParam Long id){
        ComentariosUsuarios obj = service.getById(id);
        return obj;
    }

    @PostMapping
    @ResponseBody
    public ComentariosUsuarios create(@RequestBody ComentariosUsuarios comentariosUsuarios){
        ComentariosUsuarios obj = service.create(comentariosUsuarios);
        return obj;
    }

    @PutMapping
    @ResponseBody
    public ComentariosUsuarios update(@RequestBody ComentariosUsuarios comentariosUsuarios){
        ComentariosUsuarios obj = service.create(comentariosUsuarios);
        return obj;
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        service.delete(id);
    }
}
