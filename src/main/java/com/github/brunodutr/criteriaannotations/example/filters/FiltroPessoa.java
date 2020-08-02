package com.github.brunodutr.criteriaannotations.example.filters;

import java.time.LocalDate;
import java.util.List;

import com.github.brunodutr.persistence.criteria.annotations.CriteriaColumn;
import com.github.brunodutr.persistence.criteria.annotations.CriteriaEndOfDay;
import com.github.brunodutr.persistence.criteria.annotations.CriteriaEqual;
import com.github.brunodutr.persistence.criteria.annotations.CriteriaIn;
import com.github.brunodutr.persistence.criteria.annotations.CriteriaIsNotNull;
import com.github.brunodutr.persistence.criteria.annotations.CriteriaIsNull;
import com.github.brunodutr.persistence.criteria.annotations.CriteriaLessThan;
import com.github.brunodutr.persistence.criteria.annotations.CriteriaLike;
import com.github.brunodutr.persistence.criteria.annotations.CriteriaOrderBy;
import com.github.brunodutr.persistence.criteria.annotations.CriteriaStartOfDay;

@CriteriaOrderBy(columns = "nome", sort = "desc")
public class FiltroPessoa {

	@CriteriaLessThan(equal = true)
	private Long id;
	
	@CriteriaLike
	private String nome;

	@CriteriaEqual
	private String sobrenome;
	
	@CriteriaColumn("dataNascimento")
	@CriteriaStartOfDay
	private LocalDate dataInicio;

	@CriteriaColumn("dataNascimento")
	@CriteriaEndOfDay
	private LocalDate dataFim;

	@CriteriaColumn("estado")
	@CriteriaIn
	private List<String> estados;
	
	@CriteriaColumn("estado")
	@CriteriaIsNotNull
	private Boolean estadoIsNotNull;
	
	@CriteriaColumn("estado")
	@CriteriaIsNull
	private Boolean estadoIsNull;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Boolean getEstadoIsNotNull() {
		return estadoIsNotNull;
	}

	public void setEstadoIsNotNull(Boolean estadoIsNotNull) {
		this.estadoIsNotNull = estadoIsNotNull;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getEstadoIsNull() {
		return estadoIsNull;
	}

	public void setEstadoIsNull(Boolean estadoIsNull) {
		this.estadoIsNull = estadoIsNull;
	}

}
