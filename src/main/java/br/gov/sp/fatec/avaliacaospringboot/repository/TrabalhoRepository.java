package br.gov.sp.fatec.avaliacaospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.avaliacaospringboot.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {

    
}
