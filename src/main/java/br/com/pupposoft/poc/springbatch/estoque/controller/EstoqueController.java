package br.com.pupposoft.poc.springbatch.estoque.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pupposoft.poc.springbatch.estoque.controller.json.EstoqueDecrementarJson;
import br.com.pupposoft.poc.springbatch.estoque.usecase.DecrementarEstoqueUseCase;
import br.com.pupposoft.poc.springbatch.estoque.usecase.ObterEstoqueCarrinhoUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*")//NOSONAR
@RequestMapping("poc/spring-batch/estoque/v1")
@RestController
@RequiredArgsConstructor
public class EstoqueController {

	private final ObterEstoqueCarrinhoUseCase criarCarrinhoUseCase;
	private final DecrementarEstoqueUseCase decrementarEstoqueUseCase;
	
	@GetMapping("produtos/{produtoId}/estoques")
	public Integer criar( @PathVariable(name = "produtoId") Long produtoId) {
		return criarCarrinhoUseCase.obterPorProdutoId(produtoId).getQuantidade();
	}
	
	@PatchMapping("produtos/{produtoId}/decrementar-estoque")
	public void update( @PathVariable(name = "produtoId") Long produtoId, @RequestBody(required = true) EstoqueDecrementarJson estoqueDecrementarJson) {
		decrementarEstoqueUseCase.alterarPorProdutoId(produtoId, estoqueDecrementarJson.getQuantidadeDecrementar());
	}
}
