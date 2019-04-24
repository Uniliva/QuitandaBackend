package br.com.yaman.quitanda.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO implements Serializable {
  
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private String nome;
    private TipoProdutoDTO tipoProduto;
    private String descricao;
    private Double calorias;
    private Double pesoMedio;
    
    //TODO: Remover metodos ABAIXO, pois foram criados pois não consegui fazer o loobok funcionar no STS 4
    
	public ProdutoDTO(Integer id, String nome, TipoProdutoDTO tipoProduto, String descricao, Double calorias,
			Double pesoMedio) {
		this.id = id;
		this.nome = nome;
		this.tipoProduto = tipoProduto;
		this.descricao = descricao;
		this.calorias = calorias;
		this.pesoMedio = pesoMedio;
	}
	public ProdutoDTO() {	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoProdutoDTO getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(TipoProdutoDTO tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getCalorias() {
		return calorias;
	}
	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}
	public Double getPesoMedio() {
		return pesoMedio;
	}
	public void setPesoMedio(Double pesoMedio) {
		this.pesoMedio = pesoMedio;
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
		ProdutoDTO other = (ProdutoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ProdutoDTO [id=" + id + ", nome=" + nome + ", tipoProduto=" + tipoProduto + ", descricao=" + descricao
				+ ", calorias=" + calorias + ", pesoMedio=" + pesoMedio + "]";
	}
	
	
    
    
	
}
