package com.merini.agendaspring.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merini.agendaspring.model.Classificacao;

@RestController
@RequestMapping("/classificacao")
public class ClassificacaoAPIService 
{
	private Classificacao classificacao;
	
	@GetMapping("{idClassificacao}")
	public Classificacao getClassificacaoDetails(String idClassificacao)
	{
		Classificacao classificacao = new Classificacao("Comercial","testando o componente","cinza", 7);
		return classificacao ;		
	}
	
	@PostMapping
	public String createClassificacao(@RequestBody Classificacao classificacao)
	{
		this.classificacao=classificacao;
		return "Criação bem sucedida!";		
	}	
	
	@PutMapping
	public String updateClassificacao(Classificacao classificacao)
	{
		this.classificacao	= classificacao;
		return "Classificacao atualizada com sucesso";
		
	}
	
	@DeleteMapping("{idClassificacao}")
	public String deleteClassificacaoDetails(String idClassificacao)
	{
		this.classificacao=null;
		return "Classificacao deleted Succefully";
	}
}
