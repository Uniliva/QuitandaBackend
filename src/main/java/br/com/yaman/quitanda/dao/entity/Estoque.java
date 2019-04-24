package br.com.yaman.quitanda.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ESTOQUE")
@SequenceGenerator(name = "EstoqueSeq", sequenceName = "SEQ_COD_ESTOQUE")
public class Estoque {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EstoqueSeq")
	@Column(name = "COD_ESTOQUE")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "COD_PRODUTO")
	private Produto produto;

	@Column(name = "QTD_DISPONIVEL")
	private Integer quantidadeDisponivel;

	@Column(name = "QTD_TOTAL")
	private Integer quantidadeTotal;

	public Estoque(Integer id, Produto produto, Integer quantidadeDisponivel, Integer quantidadeTotal) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.quantidadeTotal = quantidadeTotal;
	}

	public Estoque() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
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
		Estoque other = (Estoque) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estoque [id=" + id + ", produto=" + produto + ", quantidadeDisponivel=" + quantidadeDisponivel
				+ ", quantidadeTotal=" + quantidadeTotal + "]";
	}

}
