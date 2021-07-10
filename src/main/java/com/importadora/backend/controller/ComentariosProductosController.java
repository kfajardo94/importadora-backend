package com.importadora.backend.controller;

import com.importadora.backend.bo.ComentariosProductos;
import com.importadora.backend.service.ComentariosProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value="/comentariosProductos", produces = { "application/json" })
public class ComentariosProductosController {

    @Autowired
    private final ComentariosProductosService service;

    public ComentariosProductosController(ComentariosProductosService service) {
        this.service = service;
    }

    public ComentariosProductosService getService() {return service;}


    @GetMapping
    @ResponseBody
    public List<ComentariosProductos> getAll(){
        List<ComentariosProductos> lst = service.getAll();
        return lst;
    }

    @GetMapping(path = "/getById")
    @ResponseBody
    public ComentariosProductos getById(@RequestParam Long id){
        ComentariosProductos obj = service.getById(id);
        return obj;
    }

    @PostMapping
    @ResponseBody
    public ComentariosProductos create(@RequestBody ComentariosProductos comentariosProductos){
        ComentariosProductos obj = service.create(comentariosProductos);
        return obj;
    }

    @PutMapping
    @ResponseBody
    public ComentariosProductos update(@RequestBody ComentariosProductos comentariosProductos){
        ComentariosProductos obj = service.create(comentariosProductos);
        return obj;
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        service.delete(id);
    }
}
