package com.mateus.ifood.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private BigDecimal taxaFrete;
	private Boolean ativo;
	private Boolean aberto;
	private Date dataCadastro;
	private Date dataAtualização;
	
	public Restaurante() {
		
	}

	
	public Restaurante(Long id, String nome, BigDecimal taxaFrete, Boolean ativo, Boolean aberto, Date dataCadastro,
			Date dataAtualização) {
		this.id = id;
		this.nome = nome;
		this.taxaFrete = taxaFrete;
		this.ativo = ativo;
		this.aberto = aberto;
		this.dataCadastro = dataCadastro;
		this.dataAtualização = dataAtualização;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getTaxaFrete() {
		return taxaFrete;
	}

	public void setTaxaFrete(BigDecimal taxaFrete) {
		this.taxaFrete = taxaFrete;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Boolean getAberto() {
		return aberto;
	}

	public void setAberto(Boolean aberto) {
		this.aberto = aberto;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataAtualização() {
		return dataAtualização;
	}

	public void setDataAtualização(Date dataAtualização) {
		this.dataAtualização = dataAtualização;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
