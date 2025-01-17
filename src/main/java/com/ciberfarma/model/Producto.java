package com.ciberfarma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tb_productos")
public class Producto {
	
	@Id
	private String id_prod;
	private String des_prod;
	private int stk_prod;
	private float pre_prod;
	private int idcategoria;
	private int est_prod;
	private int idproveedor;
	public Producto(String id_prod, String des_prod, int stk_prod, float pre_prod, int idcategoria, int est_prod,
			int idproveedor) {
		super();
		this.id_prod = id_prod;
		this.des_prod = des_prod;
		this.stk_prod = stk_prod;
		this.pre_prod = pre_prod;
		this.idcategoria = idcategoria;
		this.est_prod = est_prod;
		this.idproveedor = idproveedor;
	}
	public Producto() {
		super();
	}
	public String getId_prod() {
		return id_prod;
	}
	public void setId_prod(String id_prod) {
		this.id_prod = id_prod;
	}
	public String getDes_prod() {
		return des_prod;
	}
	public void setDes_prod(String des_prod) {
		this.des_prod = des_prod;
	}
	public int getStk_prod() {
		return stk_prod;
	}
	public void setStk_prod(int stk_prod) {
		this.stk_prod = stk_prod;
	}
	public float getPre_prod() {
		return pre_prod;
	}
	public void setPre_prod(float pre_prod) {
		this.pre_prod = pre_prod;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public int getEst_prod() {
		return est_prod;
	}
	public void setEst_prod(int est_prod) {
		this.est_prod = est_prod;
	}
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	
	@Override
    public String toString() {
        return "Producto{" +
                "id_prod='" + id_prod + '\'' +
                ", des_prod='" + des_prod + '\'' +
                ", stk_prod=" + stk_prod +
                ", pre_prod=" + pre_prod +
                ", idcategoria=" + idcategoria +
                ", est_prod=" + est_prod +
                ", idproveedor=" + idproveedor +
                '}';
    }
	

}
