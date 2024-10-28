package br.com.pupposoft.poc.springbatch.estoque.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pupposoft.poc.springbatch.estoque.usecase.ObterEstoqueCarrinhoUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")//NOSONAR
@RequestMapping("poc/spring-batch/estoque/v1")
@RestController
@AllArgsConstructor
public class EstoqueController {

	private ObterEstoqueCarrinhoUseCase criarCarrinhoUseCase;
	
	@GetMapping("produtos/{produtoId}/estoques")
	public Long criar( @PathVariable(name = "produtoId") Long produtoId) {
		return criarCarrinhoUseCase.obterPorProdutoId(produtoId);
	}
}
