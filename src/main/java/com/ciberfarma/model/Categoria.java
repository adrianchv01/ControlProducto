package com.ciberfarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_categorias")
public class Categoria {
	
	@Id
	private int idcategoria;
	private String descripcion;
	public Categoria(int idcategoria, String descripcion) {
		super();
		this.idcategoria = idcategoria;
		this.descripcion = descripcion;
	}
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	

}
