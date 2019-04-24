package br.com.yaman.quitanda.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstoqueDTO {
	private Integer id;
    private ProdutoDTO produto;
    private Integer quantidadeDisponivel;
    private Integer quantidadeTotal;
    
}
