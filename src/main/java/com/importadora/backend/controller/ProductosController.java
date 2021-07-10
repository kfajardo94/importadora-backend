package com.importadora.backend.controller;

import com.importadora.backend.bo.Productos;
import com.importadora.backend.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value="/productos", produces = { "application/json" })
public class ProductosController {

    @Autowired
    private final ProductosService service;

    public ProductosController(ProductosService service) {
        this.service = service;
    }

    public ProductosService getService() {return service;}


    @GetMapping
    @ResponseBody
    public List<Productos> getAll(){
        List<Productos> lst = service.getAll();
        return lst;
    }

    @GetMapping(path = "/getById")
    @ResponseBody
    public Productos getById(@RequestParam Long id){
        Productos obj = service.getPruebaById(id);
        return obj;
    }

    @PostMapping
    @ResponseBody
    public Productos create(@RequestBody Productos productos){
        Productos obj = service.create(productos);
        return obj;
    }

    @PutMapping
    @ResponseBody
    public Productos update(@RequestBody Productos productos){
        Productos obj = service.create(productos);
        return obj;
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        service.delete(id);
    }
}
