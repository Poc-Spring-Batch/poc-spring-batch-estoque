package br.com.pupposoft.poc.springbatch.config.db.entity;

import br.com.pupposoft.poc.springbatch.estoque.domain.Estoque;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Estoque")
public class EstoqueEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long produtoId;
	private Integer quantidade;
	
	public Estoque getEstoqueDomain() {
		return new Estoque(
				id,
				produtoId,
				quantidade);
	}
	
	public EstoqueEntity(Estoque estoque) {
		id = estoque.getId();
		produtoId = estoque.getProdutoId();
		quantidade = estoque.getQuantidade();
	}
}
