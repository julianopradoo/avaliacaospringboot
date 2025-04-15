package br.gov.sp.fatec.avaliacaospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.avaliacaospringboot.entity.Fonte;
import br.gov.sp.fatec.avaliacaospringboot.service.FonteService;

@RestController
@CrossOrigin
@RequestMapping(value = "/fonte")
public class FonteController {
    
    @Autowired
    public FonteService service;

    @GetMapping
    public List<Fonte> buscarFontes() {
        return service.buscarTodos();
    }

    @PostMapping
    public Fonte novoFonte(@RequestBody Fonte fonte) {
        return service.novo(fonte);
    }




}
