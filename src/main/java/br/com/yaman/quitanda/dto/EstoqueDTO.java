package br.com.yaman.quitanda.dto;

import java.io.Serializable;

public class EstoqueDTO  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private ProdutoDTO produto;
    private Integer quantidadeDisponivel;
    private Integer quantidadeTotal;
    
    //TODO: Remover metodos ABAIXO, pois foram criados pois não consegui fazer o loobok funcionar no STS 4
    
	public EstoqueDTO(Integer id, ProdutoDTO produto, Integer quantidadeDisponivel, Integer quantidadeTotal) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.quantidadeTotal = quantidadeTotal;
	}
	
	public EstoqueDTO() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ProdutoDTO getProduto() {
		return produto;
	}
	public void setProduto(ProdutoDTO produto) {
		this.produto = produto;
	}
	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	public Integer getQuantidadeTotal() {
		return quantidadeTotal;
	}
	public void setQuantidadeTotal(Integer quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
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
		EstoqueDTO other = (EstoqueDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EstoqueDTO [id=" + id + ", produto=" + produto + ", quantidadeDisponivel=" + quantidadeDisponivel
				+ ", quantidadeTotal=" + quantidadeTotal + "]";
	}
    
	
    
    
}
