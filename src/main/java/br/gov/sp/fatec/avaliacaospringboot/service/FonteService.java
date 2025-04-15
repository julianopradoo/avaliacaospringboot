package br.gov.sp.fatec.avaliacaospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.avaliacaospringboot.entity.Fonte;
import br.gov.sp.fatec.avaliacaospringboot.repository.FonteRepository;

@Service
public class FonteService {
    

    @Autowired
    private FonteRepository repo;

    public List<Fonte> buscarTodos() {
        return repo.findAll();
    }

    public Fonte novo(Fonte fonte) {
        if(fonte.getDescritivo().length() <= 4 ||
            fonte.getPotenciaReal() == null ||
            fonte.getPotenciaReal() >= fonte.getPotenciaNominal()) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Instruções inadequadas");
            }
        return repo.save(fonte);

        }
}
