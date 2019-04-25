package br.com.yaman.quitanda.dto;

import java.io.Serializable;


public class TipoProdutoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private String nome;
    
  //TODO: Remover metodos ABAIXO, pois foram criados pois não consegui fazer o loobok funcionar no STS 4
    
    
	public Integer getId() {
		return id;
	}
	public TipoProdutoDTO(Integer id, String nome) {
	this.id = id;
	this.nome = nome;
}
	public TipoProdutoDTO() {}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		TipoProdutoDTO other = (TipoProdutoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "TipoProdutoDTO [id=" + id + ", nome=" + nome + "]";
	}
    
    

}
