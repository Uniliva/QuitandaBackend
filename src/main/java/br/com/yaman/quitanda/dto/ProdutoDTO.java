package br.com.yaman.quitanda.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {
    private Integer id;
    private String nome;
    private TipoProdutoDTO tipoProduto;
    private String descricao;
    private Double calorias;
    private Double pesoMedio;
	
}
