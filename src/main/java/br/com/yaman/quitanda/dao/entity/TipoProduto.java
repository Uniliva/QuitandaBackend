package br.com.yaman.quitanda.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TIPO_PRODUTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_TIPO_PRODUTO")
    private Integer id;
    @Column(name = "NOME")
    private String nome;

}
