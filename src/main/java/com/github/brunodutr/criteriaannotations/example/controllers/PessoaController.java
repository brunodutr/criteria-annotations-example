package com.github.brunodutr.criteriaannotations.example.controllers;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.brunodutr.criteriaannotations.example.entity.Pessoa;
import com.github.brunodutr.criteriaannotations.example.filters.FiltroPessoa;
import com.github.brunodutr.persistence.criteria.service.CriteriaProcessor;


@RestController
public class PessoaController {

	@Autowired
	private EntityManager entityManager;

	@PostMapping("pessoas/buscar")
	public List<Pessoa> buscarPessoas(@RequestBody FiltroPessoa filtroPessoa) {

		return CriteriaProcessor.create(entityManager, Pessoa.class)
						        .filter(filtroPessoa)
						        .getResultList();
		
	}
	
}
