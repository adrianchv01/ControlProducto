package com.ciberfarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_proveedor")
public class Proveedor {
	
	@Id
	private int idproveedor;
	private String nombre_rs;
	private String telefono;
	public Proveedor() {
		super();
	}
	public Proveedor(int idproveedor, String nombre_rs, String telefono) {
		super();
		this.idproveedor = idproveedor;
		this.nombre_rs = nombre_rs;
		this.telefono = telefono;
	}
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	public String getNombre_rs() {
		return nombre_rs;
	}
	public void setNombre_rs(String nombre_rs) {
		this.nombre_rs = nombre_rs;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
