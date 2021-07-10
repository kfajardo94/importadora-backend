package com.importadora.backend.controller;

import com.importadora.backend.bo.Usuarios;
import com.importadora.backend.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value="/usuarios", produces = { "application/json" })
public class UsuariosController {

    @Autowired
    private final UsuariosService service;

    public UsuariosController(UsuariosService service) {
        this.service = service;
    }

    public UsuariosService getService() {return service;}


    @GetMapping
    @ResponseBody
    public List<Usuarios> getAll(){
        List<Usuarios> lst = service.getAll();
        return lst;
    }

    @GetMapping(path = "/getById")
    @ResponseBody
    public Usuarios getById(@RequestParam Long id){
        Usuarios obj = service.getById(id);
        return obj;
    }

    @PostMapping
    @ResponseBody
    public Usuarios create(@RequestBody Usuarios usuarios){
        Usuarios obj = service.create(usuarios);
        return obj;
    }

    @PutMapping
    @ResponseBody
    public Usuarios update(@RequestBody Usuarios usuarios){
        Usuarios obj = service.create(usuarios);
        return obj;
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        service.delete(id);
    }
}
