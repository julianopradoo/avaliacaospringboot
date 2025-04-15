package br.gov.sp.fatec.avaliacaospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.avaliacaospringboot.entity.Trabalho;
import br.gov.sp.fatec.avaliacaospringboot.repository.TrabalhoRepository;

@Service
public class TrabalhoService {
    
    @Autowired
    private TrabalhoRepository repo;

    public List<Trabalho> buscarTodos() {
        return repo.findAll();
    }
}
