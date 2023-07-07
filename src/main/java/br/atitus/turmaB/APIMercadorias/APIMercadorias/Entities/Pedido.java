package br.atitus.turmaB.APIMercadorias.APIMercadorias.Entities;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido extends GenericEntity {
	
	private static final long serialVersionUID = 1l;
	
	@Column(nullable = true)
	private Date data;
	
	@Column(nullable = true)
	private double quantidade;

	@ManyToOne
	@JoinColumn(nullable = true, name ="id_produto")
	private Mercadoria produto;

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public Mercadoria getProduto() {
		return produto;
	}
	public void setProduto(Mercadoria produto) {
		this.produto = produto;
	}
}