package br.gov.sp.fatec.avaliacaospringboot.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fon_fonte")
public class Fonte {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fon_id")
    private Long id; 

    @Column(name = "fon_descritivo")
    private String descritivo;

    @Column(name = "fon_preco_sugerido")
    private Float precoSugerido;

    @Column(name = "fon_data_lancamento")
    private LocalDate dataLancamento;

    @Column(name = "fon_potencia_real")
    private Integer potenciaReal;

    @Column(name = "fon_potencia_nominal")
    private Integer potenciaNominal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public Float getPrecoSugerido() {
        return precoSugerido;
    }

    public void setPrecoSugerido(Float precoSugerido) {
        this.precoSugerido = precoSugerido;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getPotenciaReal() {
        return potenciaReal;
    }

    public void setPotenciaReal(Integer potenciaReal) {
        this.potenciaReal = potenciaReal;
    }

    public Integer getPotenciaNominal() {
        return potenciaNominal;
    }

    public void setPotenciaNominal(Integer potenciaNominal) {
        this.potenciaNominal = potenciaNominal;
    }




}
