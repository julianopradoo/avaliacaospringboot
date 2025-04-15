package br.gov.sp.fatec.avaliacaospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.avaliacaospringboot.entity.Trabalho;
import br.gov.sp.fatec.avaliacaospringboot.service.TrabalhoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/trabalho")
public class TrabalhoController {

    @Autowired
    public TrabalhoService service;

    @GetMapping
    public List<Trabalho> buscarTrabalhos() {
        return service.buscarTodos();
    }
    
}
